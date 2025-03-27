package Ejercicio5;

public class NaveEspacial {
    private String nombre;
    private int combustible;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public void despegar(){
        if (this.combustible > 10){
            System.out.println("Despegue inicializado");
            this.combustible -= 10;
        }else System.out.println("Combustible insuficiente");

    }
    public void avanzar(int distancia){

        if(this.combustible > distancia){
            this.combustible -= distancia;
            System.out.println("La nave avanza "+ distancia+" unidad/es");
        }else System.out.println("Combustible insuficiente");
    }

    public void recargarCombustible(int cantidad){
        if (this.combustible + cantidad > 100){
            System.out.println("El combustible excede el limite (100 unidades)");
        } else if (cantidad > 0 && this.combustible+cantidad < 100)  {
            this.combustible += cantidad;
            System.out.println("Carga de combustible exitosa, la cantidad de combustible es " + this.combustible);
        }
    }
    public void mostrarEstado(){
        System.out.println("Nombre de la nave: "+ this.nombre + " Combustible actual: "+ this.combustible);

    }



}
