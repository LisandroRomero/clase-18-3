package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Principito","Antoine de Saint-Exupey",1943);


        libro1.mostrarInfo();
        libro1.setAnioPublicacion(1899);
        libro1.mostrarInfo();
        libro1.setAnioPublicacion(2020);
        libro1.mostrarInfo();
    }
}
