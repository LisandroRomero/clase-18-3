package Ejercicio4;

public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    private static int contador = 0;

    public Gallina(int edad, int huevosPuestos) {
        contador ++;
        this.idGallina = contador;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }

    public void ponerHuevo(){
        this.huevosPuestos +=1;
    }
    public void envejecer(){
        this.edad +=1;
    }
    public void mostrarEstado(){
        System.out.println("ID de la gallina " + this.idGallina + "Edad de la gallina: "+ this.edad+ " años" + " Cantidad de huevos puestos: " + this.huevosPuestos);
    }
}
