package cocomo_basico;

import java.awt.Button;
import javax.swing.JButton;

/**
 *
 * @author Steeven Armijos, Jhulissa Villamagua
 */
public class Calculos {

    /**
     * Este método permite calcular (estimar) el esfuerzo total necesario para
     * desarrollar el producto de software, expresada en meses por persona
     *
     * @param constante_a es una constante definida en el modelo COCOMO Básico
     * @param KLOC es el tamaño estimado del producto de software indican en
     * Kilo líneas de código (obteniéndolo desde los archivos fuente del
     * proyecto o ingresados manualmente)
     * @param constante_b es una constante definida en el modelo COCOMO Básico
     * @return Double Devuelve es esfuerzo total
     */
    public double Esfuerzo(double constante_a, double KLOC, double constante_b) {
        //E = a*(KLOC)^b
        double milesDeLineasCodigo = KLOC / 1000;
        System.out.println("KLOC= " + milesDeLineasCodigo);
        double Esfuerzo = constante_a * Math.pow(milesDeLineasCodigo, constante_b);
        //System.out.println("Division " + milesDeLineasCodigo);
        return Esfuerzo;

    }

    /**
     * Este método permite calcular el tiempo estimado para desarrollar el
     * software, expresado en meses
     *
     * @param constante_c es una constante definida en el modelo COCOMO Básico
     * @param Esfuerzo el esfuerzo total necesario para desarrollar el producto
     * de software previamnte calculado.
     * @param constante_d es una constante definida en el modelo COCOMO Básico
     * @return Double Devuelve el tiempo estimado para desarrollar el software,
     * expresado en meses
     */
    public double TiempoDeDesarrollo(double constante_c, double Esfuerzo, double constante_d) {
        //D = c*(E)^d
        double TiempoDesarrollo = constante_c * Math.pow(Esfuerzo, constante_d);
        return TiempoDesarrollo;
    }

    /**
     * Este método permite estimar el cálculo del número de personas que se
     * requerirán en el proyecto.
     *
     * @param Esfuerzo es el esfuerzo total necesario para desarrollar el
     * producto de software previamnte calculado.
     * @param TiempoDesarrollo es el el tiempo estimado para desarrollar el
     * software, expresado en meses previamnte calculado.
     * @return Double Devuelve el número de personas requeridas (estimadas) para
     * el proyecto
     */
    public double Personal(double Esfuerzo, double TiempoDesarrollo) {
        //E = E/D
        double Personal = Esfuerzo / TiempoDesarrollo;
        return Personal;
    }

    /**
     * Este método permite estimar el cálculo el costo total del proyecto por Salario
     *
     * @param Personal es el número de personas requeridas (estimadas) para el
     * proyecto previamente calculado.
     * @param Salario es el salario que se definirá para los trabajadores, es un
     * valor que se requiere para realizar la estimación del salario total.
     * @return Double devuelve el costo total del proyecto
     */
    public double CostoTotalProyectoPorSalario(double Personal, double Salario, double Meses) {
        //C = P*Salario
        double CostoTotalProyecto = Personal * Salario*Meses;
        return CostoTotalProyecto;
    }

    /**
     * Con este método obtenemos la productividad de los trabajadores, es decir, 
     * las líneas de código medidad en hora - trabajador
     * @param KLOC estas son las líneas de código obtenidas
     * @param Esfuerzo es el esfuerzo calculado previamente
     * @return retornamos un double que es el valor de la productividad
     */
    public double Productividad(double KLOC, double Esfuerzo) {
        //PR =  LDC/e;
        double productividad = KLOC / Esfuerzo;
        return productividad;
    }
    
    /**
     * Este método nos permite calcular el costo del proyecto, considerando 
     * las líneas de código (LDC) total del proyecto
     * @param KLOC recibimos como parámetro las líneas de código leídas previamente
     * @param Productividad este valor ya es calculado anteriormente, sólo se lo 
     * recibe como parámetro para hacer el cálculo
     * @return retornamos un valor double con el costo total del proyecto
     * de acuerdo a las líneas de código
     */
    public double CostoProyectoPorLDC(double KLOC, double Productividad) {
        //PR =  LDC/e;
        double CostoProyectoPorLDC = KLOC * Productividad;
        return CostoProyectoPorLDC;
    }
    
    /**
     * Este método permite calcular los imprevistos del proyecto
     * @param CostoDelProyecto recibimos el valor del costo total del proyecto 
     * para poder aumentarle el 35% de los imprevistos
     * @return devuelve un valor de tipo double que viene a ser el costo total
     * del proyecto sumado el costo de imprevistos.
     */
    public double CalculoDeImprevistos(double CostoDelProyecto){
        double TreintaPorCiento = CostoDelProyecto*0.35;
        return TreintaPorCiento;
    }
}
