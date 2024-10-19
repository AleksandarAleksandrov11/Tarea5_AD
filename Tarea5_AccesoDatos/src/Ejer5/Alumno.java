package Ejer5;

import java.util.Date;

/**
 * La clase Alumno representa a un alumno con atributos como NIA, nombre, apellidos, 
 * género, fecha de nacimiento, ciclo, curso y grupo. 
 * Esta clase permite almacenar los datos básicos de un alumno.
 * 
 * 
 * @author Aleksandar Aleksandrov
 */
public class Alumno {

    private int nia;
    private String nombre, apellidos, ciclo, curso, grupo;
    private char genero;
    private Date fNacimiento = new Date();

    /**
     * Constructor que inicializa todos los atributos del alumno.
     * 
     * @param nia Número de identificación del alumno.
     * @param nombre Nombre del alumno.
     * @param apellidos Apellidos del alumno.
     * @param genero Género del alumno ('M' para masculino, 'F' para femenino).
     * @param fNacimiento Fecha de nacimiento del alumno.
     * @param ciclo Ciclo en el que está matriculado el alumno.
     * @param curso Curso en el que está matriculado el alumno.
     * @param grupo Grupo al que pertenece el alumno.
     */
    public Alumno(int nia, String nombre, String apellidos, char genero, Date fNacimiento,
                  String ciclo, String curso, String grupo) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ciclo = ciclo;
        this.curso = curso;
        this.grupo = grupo;
        this.genero = genero;
        this.fNacimiento = fNacimiento;
    }

    /**
     * Constructor por defecto que crea un Alumno sin atributos.
     */
    public Alumno() {
    }

    /**
     * Devuelve el NIA del alumno.
     * 
     * @return El número de identificación del alumno.
     */
    public int getNia() {
        return nia;
    }

    /**
     * Establece el NIA del alumno.
     * 
     * @param nia El número de identificación del alumno.
     */
    public void setNia(int nia) {
        this.nia = nia;
    }

    /**
     * Devuelve el nombre del alumno.
     * 
     * @return El nombre del alumno.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del alumno.
     * 
     * @param nombre El nombre del alumno.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve los apellidos del alumno.
     * 
     * @return Los apellidos del alumno.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos del alumno.
     * 
     * @param apellidos Los apellidos del alumno.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Devuelve el ciclo del alumno.
     * 
     * @return El ciclo del alumno.
     */
    public String getCiclo() {
        return ciclo;
    }

    /**
     * Establece el ciclo del alumno.
     * 
     * @param ciclo El ciclo del alumno.
     */
    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    /**
     * Devuelve el curso del alumno.
     * 
     * @return El curso del alumno.
     */
    public String getCurso() {
        return curso;
    }

    /**
     * Establece el curso del alumno.
     * 
     * @param curso El curso del alumno.
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * Devuelve el grupo del alumno.
     * 
     * @return El grupo del alumno.
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * Establece el grupo del alumno.
     * 
     * @param grupo El grupo del alumno.
     */
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    /**
     * Devuelve el género del alumno.
     * 
     * @return El género del alumno.
     */
    public char getGenero() {
        return genero;
    }

    /**
     * Establece el género del alumno.
     * 
     * @param genero El género del alumno.
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * Devuelve la fecha de nacimiento del alumno.
     * 
     * @return La fecha de nacimiento del alumno.
     */
    public Date getfNacimiento() {
        return fNacimiento;
    }

    /**
     * Establece la fecha de nacimiento del alumno.
     * 
     * @param fNacimiento La fecha de nacimiento del alumno.
     */
    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

}
