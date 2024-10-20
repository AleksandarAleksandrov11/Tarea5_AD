package Ejer5;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

/**
 * La clase LeerFichero se encarga de leer objetos de tipo Alumno desde un archivo binario.
 * Pide al usuario la ruta del archivo y luego lee y muestra 5 objetos Alumno.
 * 
 * @author Aleksandar Aleksandrov
 */
public class LeerFichero {

    /**
     * Método principal que ejecuta el programa.
     * Pide al usuario la ruta del archivo binario y luego lee 5 objetos Alumno desde el archivo.
     * 
     * @param ruta La ruta y el nombre del archivo.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ruta;
        System.out.println("Dime la ruta y el nombre del archivo binario");
        ruta = sc.nextLine();

        File fich = new File(ruta);

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(ruta));

            for (int i = 1; i < 6; i++) {
                Alumno a = (Alumno) ois.readObject();
                System.out.println(a.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                    sc.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}