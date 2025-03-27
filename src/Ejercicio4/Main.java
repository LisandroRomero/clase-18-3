package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina(3,30);
        Gallina gallina2 = new Gallina(1,20);

        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        gallina1.envejecer();
        gallina2.envejecer();
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

    }
}
