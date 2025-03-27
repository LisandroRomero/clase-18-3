package ejercicio1;

import java.util.Objects;

public class Estudiante {

    private String nombre;
    private  String apellido;
    private  String curso;
    private Double calificacion;
    private int legajo;
    private static int contador = 1000;

    public Estudiante(String nombre, String apellido, String curso, Double calificacion) {
        contador ++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
        this.legajo = contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }
    public void mostrarinfo(){
        System.out.println("Nombre: " + nombre  + "\nApellido: "+ apellido + "\nCurso: " +curso+"\nCalificacion: "+calificacion);

    }
    public void subirCalificacion(double puntos){
        if (calificacion+puntos <= 10){
            calificacion += puntos;
        }else {
            calificacion = 10.0;
        }
    }
    public void bajarCalificacion(double puntos){
        if (calificacion - puntos >= 0){
            calificacion -= puntos;
        }else {
            calificacion = 0.0;
        }
    }
    @Override
    public String toString(){
        return "Estudiante [nombre=" + nombre
                + ", apellido=" + apellido
                + ", curso=" + curso
                + ", calificacion=" + calificacion
                + ", legajo=" + legajo + "]";
    }

   //  public boolean equals(Estudiante estudiante){
    //    return (this.legajo == estudiante.legajo);
  //}
    // public int hashCode(){

    // }
    // Compara los estudiantes por legajo
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  //estandar
        if (obj == null || getClass() != obj.getClass()) return false; // estandar
        Estudiante that = (Estudiante) obj; //that pasa a ser el estudiante
        return legajo == that.legajo; // compara los legajos ya que es el valor que no se repite
    }

    // Creo el codigo hash mediante el legajo
    @Override
    public int hashCode() {
        return Objects.hash(legajo); //se crea a partir del legajo ya que el legajo es unico
    }
}
