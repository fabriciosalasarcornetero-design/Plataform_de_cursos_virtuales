package Composite;

public class Leccion implements Contenido{
    private String nombre;
    public Leccion(String nombre){
        this.nombre= nombre;
    }

    @Override
    public void mostrar() {
        System.out.println("Leccion:"+ nombre);

    }
}
