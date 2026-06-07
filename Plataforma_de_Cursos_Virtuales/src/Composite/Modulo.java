package Composite;

import java.util.ArrayList;
import java.util.List;

public class Modulo implements Contenido{
    private String nombre;
    private List<Contenido> contenidos= new ArrayList<>();

    public Modulo(String nombre){
        this.nombre = nombre;
    }

    public void agregar(Contenido contenido){
        contenidos.add(contenido);
    }
    @Override
    public void mostrar() {
        System.out.println(" Modulo:"+nombre);
        for(Contenido c : contenidos){
            c.mostrar();
        }

    }
}
