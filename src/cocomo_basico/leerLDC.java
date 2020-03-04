package cocomo_basico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Steeven Armijos, Jhulissa Villamagua
 */
public class leerLDC {

    Comprobaciones c = new Comprobaciones();
    int cont = 0;

    /**
     * Este método permite buscar archivos de algún proyecto de software
     *
     * @param direccionArchivo este parámetro sirve para saber la ruta del
     * archivo
     * @return retorna el total de líneas contadas en el archivos
     * @throws FileNotFoundException Esta excepción aparece cuando se intenta
     * abrir un fichero y no se encuentra en la ruta especificada.
     * @throws IOException cuando se produce un error de entrada y salida del
     * programa es necesario tratarla
     */
    public int leerPorArchivos(String direccionArchivo) throws FileNotFoundException, IOException {

        String cadena;
        FileReader f = new FileReader(direccionArchivo);
        BufferedReader b = new BufferedReader(f);

        while ((cadena = b.readLine()) != null) {
            if (c.DetectarComentarios(cadena) == -1) {
                cont++;
            }
        }
        b.close();
        System.out.println("Contando líneas dentro de archivos: " + cont);
        return cont;
    }

    /**
     * Este método permite buscar archivos de algún proyecto completo de
     * software desarrollado y evaluar sus líneas de código
     *
     * @param RutaDelProyecto este parámetro sirve para saber la ruta del
     * proyecto
     * @return retorna el total de líneas contadas en los archivos del proyecto
     * @throws FileNotFoundException Esta excepción aparece cuando se intenta
     * abrir un fichero y no se encuentra en la ruta especificada.
     * @throws IOException cuando se produce un error de entrada y salida del
     * programa es necesario tratarla
     */
    public int leerProyectoCompleto(File RutaDelProyecto) throws FileNotFoundException, IOException {
        ArrayList<String> FiltroParaArchivos = new ArrayList<String>();

        FiltroParaArchivos.add(".java");
        FiltroParaArchivos.add(".js");
        FiltroParaArchivos.add(".php");
        FiltroParaArchivos.add(".py");
        FiltroParaArchivos.add(".net");
        FiltroParaArchivos.add(".ts");
        FiltroParaArchivos.add(".cpp");
        FiltroParaArchivos.add(".c");
        FiltroParaArchivos.add(".json");
        FiltroParaArchivos.add(".html");
        FiltroParaArchivos.add(".css");
        FiltroParaArchivos.add(".vb");
        FiltroParaArchivos.add(".h");

        File[] ArchivosDelProyecto = RutaDelProyecto.listFiles();
        for (File Archivo : ArchivosDelProyecto) {
            if (Archivo.isDirectory()) {
                leerProyectoCompleto(Archivo);
            } else {

                Iterator<String> FiltrosParaArchivos = FiltroParaArchivos.iterator();
                while (FiltrosParaArchivos.hasNext()) {
                    if (Archivo.getCanonicalPath().toString().endsWith(FiltrosParaArchivos.next())) {
                        String cadena;
                        FileReader f = new FileReader(Archivo.getAbsolutePath());
                        BufferedReader b = new BufferedReader(f);
                        while ((cadena = b.readLine()) != null) {
                            if (c.DetectarComentarios(cadena) == -1) {
                                cont++;
                            }
                        }
                        b.close();
                    }
                }
            }
        }

        return cont;
    }

}
