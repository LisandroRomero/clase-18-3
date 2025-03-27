package ejercicio1;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Lisandro","Romero", "Programacion",7.5);


        estudiante1.mostrarinfo();
        estudiante1.bajarCalificacion(4.5);
        estudiante1.mostrarinfo();
        estudiante1.subirCalificacion(6.0);
        estudiante1.mostrarinfo();

    }
}