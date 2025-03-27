package Ejercicio3;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 1900 && anioPublicacion < 2025) {
            this.anioPublicacion = anioPublicacion;
            System.out.println("libro actualizado con exito");
        }else System.out.println("El libro no se puede actualizar, por favor ingrese una fecha entre 1900 y 2025");
    }
    public void mostrarInfo(){
        System.out.println("Nombre del Libro: "+ this.titulo + " Autor del Libro: "+ this.autor+ " Año de publicacion: "+ this.anioPublicacion);
    }
}
