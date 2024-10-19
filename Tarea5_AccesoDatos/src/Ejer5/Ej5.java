package Ejer5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * La clase Ej5 permite crear registros de alumnos pidiendo la información
 * al usuario para posteriormente guardarla en un archivo binario con el nombre
 * y la ruta proporcionada por el usuario, también lee la informacion y la muestra
 * por pantalla.
 * 
 * 
 * @author Aleksandar Aleksandrov
 */
public class Ej5 {

    /**
     * El método main maneja la entrada del usuario y 
     * escribe los registros de los alumnos en un archivo binario
     * para después leerlos y mostarlos por consola, conviertiendo 
     * los bytes a caracteres.
     * 
     * 
     * @param ruta La ruta y el nombre del archivo binario.
     * @param cont Cada byte del archivo binario.
     * @throws ParseException Si hay un error en la fecha de nacimiento.
     */
	public static void main(String[] args) throws ParseException {
		
		try {
			
			Alumno a = new Alumno();
			Scanner sc = new Scanner(System.in);
			String ruta;
			System.out.println("Dime la ruta y el nombre del archivo binario");
			ruta = sc.nextLine();
			
			FileOutputStream fos = new FileOutputStream(ruta);
			FileInputStream fis = new FileInputStream(ruta);
			
			for (int i = 1; i < 6; i++) {
				
				System.out.println("Dime el nia del alumno "+i);
				a.setNia(sc.nextInt());
				
				System.out.println("Dime el nombre del alumno "+i);
				a.setNombre(sc.next());
				
				System.out.println("Dime los apellidos del alumno "+i);
				a.setApellidos(sc.nextLine());
				sc.nextLine();
				
				System.out.println("Dime el genero del alumno "+i);
				a.setGenero(sc.next().charAt(0));
				sc.nextLine();
				
				System.out.println("Dime la fecha de nacimiento del alumno "+i);
				String fechaFormatoTexto=sc.nextLine();
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				a.setfNacimiento(formato.parse(fechaFormatoTexto));
				
				System.out.println("Dime el ciclo del alumno "+i);
				a.setCiclo(sc.next());
				
				System.out.println("Dime el curso del alumno "+i);
				a.setCurso(sc.next());
				
				System.out.println("Dime el grupo del alumno "+i);
				a.setGrupo(sc.next());
				
				String texto = "Alumno "+i+": [NIA-> "+a.getNia()+", NOMBRE-> "+a.getNombre()+", APELLIDOS-> "+a.getApellidos()+", GENERO-> "+a.getGenero()+
						", FechaDeNacimiento-> "+a.getfNacimiento()+", CICLO-> "+a.getCiclo()+", CURSO-> "+a.getCurso()+", GRUPO-> "+a.getGrupo()+"]\n" ;
				
				byte codigos[] = texto.getBytes();
				
				fos.write(codigos);
				
			}
			
				fos.close();
			
	            int cont;
	            StringBuilder contenido = new StringBuilder();

	            while ((cont = fis.read()) != -1) {
	            	contenido.append((char) cont);
	            }
	            
	            fis.close();
	            
	            System.out.println(contenido.toString());
	            
	            sc.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
	
	
}
