
package testCocomo;

import cocomo_basico.Calculos;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Steeven Armijos, Jhulissa Villamagua
 */
public class testDeCalculos {
    
    /**
     * Primeramente se instancia un objeto de la clase Calculos
     */
    Calculos calculos = new Calculos();

    /**
     * Este test se utiliza para comparar que el resultado de aplicar la fórmula
     * devuelva el resultado correcto del esfuerzo
     */
    @Test
    public void Esfuerzo() {
        double resultado = calculos.Esfuerzo(2.4, 32, 1.05);
        double resultadoEsfuerzo = 0.06465747178182137;
        assertEquals(resultadoEsfuerzo, resultado, 0.01);
    }

    /**
     * Este test se utiliza para comparar que el resultado de aplicar la fórmula
     * devuelva el resultado correcto del tiempo de desarrollo
     */
    @Test
    public void TiempoDesarrollo() {
        double resultado = calculos.TiempoDeDesarrollo(2.50, 91, 0.38);
        double resultadoT_Desarrollo = 13.879561250028607;
        assertEquals(resultadoT_Desarrollo, resultado, 0.01);
    }

    /**
     * Este test se utiliza para comparar que el resultado de aplicar la fórmula
     * devuelva el resultado correcto del número de trabajadores
     */
    @Test
    public void Trabajadores() {
        double resultado = calculos.Personal(91.33110643220898, 13.879561250028607);
        double resultadoTrabajadores = 6.580258899179594;
        assertEquals(resultadoTrabajadores, resultado, 0.01);
    }

    /**
     * Este test se utiliza para comparar que el resultado de aplicar la fórmula
     * devuelva el resultado correcto del costo total del proyecto
     */
    @Test
    public void CostoDelProyecto() {
        double resultado = calculos.CostoTotalProyectoPorSalario(6.580258899179594, 800, 7);
        double costoTot_Proyecto = 36849.44983540573;
        assertEquals(costoTot_Proyecto, resultado, 0.01);
    }
    
    /**
     * Este test se utiliza para comparar que el resultado de aplicar la fórmula
     * devuelva el resultado correcto de la Productividad
     */
    @Test
    public void Productividad() {
        double resultado = calculos.Productividad(32, 0.06465747178182137);
        double valor_Productiviidad = 494.91573236856584;
        assertEquals(valor_Productiviidad, resultado, 0.01);
    }
    
    /**
     * Este test se utiliza para comparar que el resultado de aplicar la fórmula
     * devuelva el resultado correcto del Costo Proyecto por líneas de código
     */
    @Test
    public void CostoProyectoPorLDC() {
        double resultado = calculos.CostoProyectoPorLDC(32, 0.06465747178182137);
        double CostoPorLDC = 2.0690390970182837;
        assertEquals(CostoPorLDC, resultado, 0.01);
    }
    
    /**
     * Este test se utiliza para comparar que el resultado de aplicar la fórmula
     * devuelva el costo de imprevistos
     */
    @Test
    public void CalculandoImprevistos() {
        double resultado = calculos.CalculoDeImprevistos(5000);
        double CostoPorLDC = 1750;
        assertEquals(CostoPorLDC, resultado, 0.01);
    }
}
