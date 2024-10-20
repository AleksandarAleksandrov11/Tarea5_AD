package Ejer5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * La clase Fichero se encarga de crear un archivo binario y escribir en él cinco objetos de tipo Alumno.
 * Pide al usuario la ruta del archivo y luego pide los datos de los alumnos.
 * 
 * @author Aleksandar Aleksandrov
 */
public class Fichero {

    /**
     * Método principal que ejecuta el programa.
     * Pide al usuario la ruta del archivo binario y luego pide los datos
     * de cinco alumnos, los cuales se escriben en el archivo binario.
     * 
     * @param ruta La ruta y el nombre del archivo.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ruta;
        System.out.println("Dime la ruta y el nombre del archivo binario");
        ruta = sc.nextLine();

        File fich = new File(ruta);
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(fich));

            for (int i = 1; i < 6; i++) {
                Alumno a = new Alumno();
                a.leerAlumnos(sc, i);
                oos.writeObject(a);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                    sc.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}