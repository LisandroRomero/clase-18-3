public class Estudiante {

    private String nombre;
    private  String apellido;
    private  String curso;
    private Double calificacion;

    public Estudiante(String nombre, String apellido, String curso, Double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
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
}
