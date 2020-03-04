package cocomo_basico;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Steeven Armijos, Jhulissa Villamagua
 */
public class Comprobaciones {

    /**
     * Este método permite omitir los comentarios al momento de realizar el
     * conteo de las líneas de código de un archivo, se ha considerado los
     * caracteres más comunes entre los diferentes lenguajes de programación
     *
     * @param lineaLeida este parámetro permite evaluar la línea que se está
     * leyendo
     * @return retorna un valor entero 0 o -1, dependiendo del resultado en las
     * condiciones que se han codificado.
     */
    public int DetectarComentarios(String lineaLeida) {
        //System.out.println("Linea leida>>>>> "+lineaLeida.replace(" ", ""));
        
        if (lineaLeida.replace(" ", "").startsWith("//")) {
            //System.out.println("leido //");
            return 0;
        }
        if (lineaLeida.replace(" ", "").startsWith("#")) {
            //System.out.println("leido #");
            return 0;
        }
        if (lineaLeida.replace(" ", "").contains("/**") || lineaLeida.replace(" ", "").contains("/*")) {
            //System.out.println("leido /*");
            return 0;
        }
        if (lineaLeida.replace(" ", "").startsWith("*")) {
            //System.out.println("leido *");
            return 0;
        }
        if (lineaLeida.replace(" ", "").contains("<!--")) {
            //System.out.println("leido <--!");
            return 0;
        }
        if (lineaLeida.isEmpty()) {
            //System.out.println("leido vacias");
            return 0;
        }
        if (lineaLeida.replace(" ", "").length()==0) {
            //System.out.println("leido null");
            return 0;
        }
        if (lineaLeida.replace(" ", "").contains("import") || lineaLeida.replace(" ", "").contains("package")) {
            //System.out.println("leido package");
            return 0;
        }
        //System.out.println("linea contada");
        return -1;
        
    }

    /**
     * Este método permite activar o desactivar las flechas en el programa
     * dependiendo del número de líneas de código ingresadas para sugerir 
     * utilizar un determinado tipo de proyecto de COCOMO81
     * @param líneasDeodigo es necesario para comparar si las LDC son 
     * mayores a 1000
     * @param ActivarOrganico es un Jlabel de la imagen de una flecha 
     * que apunta al tipo de proyecto orgánico
     * @param ActivarSemiAcoplado es un Jlabel de la imagen de una flecha 
     * que apunta al tipo de proyecto SemiAcoplado
     * @param ActivarEmpotrado es un Jlabel de la imagen de una flecha
     * que apunta al tipo de proyecto Empotrado
     */
    public void TipoDeProyecto(int líneasDeodigo, JLabel ActivarOrganico,
            JLabel ActivarSemiAcoplado, JLabel ActivarEmpotrado) {

        if (líneasDeodigo >= 1000 && líneasDeodigo <= 50000) {
            ActivarOrganico.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Se recomienda elegir tipo de proyecto Orgánico");
            ActivarSemiAcoplado.setEnabled(false);
            ActivarEmpotrado.setEnabled(false);
        }
        if (líneasDeodigo > 50000 && líneasDeodigo <= 300000) {
            ActivarSemiAcoplado.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Se recomienda elegir tipo de proyecto SemiAcoplado");
            ActivarOrganico.setEnabled(false);
            ActivarEmpotrado.setEnabled(false);
        }
        if (líneasDeodigo > 300000) {
            ActivarEmpotrado.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Se recomienda elegir tipo de proyecto Empotrado");
            ActivarSemiAcoplado.setEnabled(false);
            ActivarOrganico.setEnabled(false);
        }
    }

    
    /**
     * Este método permite validar que solo se ingresen valores de tipo 
     * double al momento de solicitar al usuario que ingrese el 
     * salario que asignará por medio de un showInputDialog
     * @return retorna el valor ingresado y que se permita (SUELDO)
     */
    public double ValidadPeticionSueldo() {
        
        
        double numero=0;
        boolean bandera = false;
        do {
            try {
                numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario").replace(",", "."));
                System.out.println("numerito "+numero);
                if (numero>0) {
                     bandera = true;
                }else{
                    JOptionPane.showMessageDialog(null, "Ingrese un salario válido");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se permiten numeros");
                bandera = false;
            }
        } while (!bandera);
        return numero;
    }
}


