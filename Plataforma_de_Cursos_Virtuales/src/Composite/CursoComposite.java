package Composite;

import java.util.ArrayList;
import java.util.List;

public class CursoComposite implements Contenido{
    private String nombre;
    private List<Contenido> modulos = new ArrayList<>();

    public CursoComposite(String nombre){
        this.nombre = nombre;
    }

    public void agregar(Contenido contenido){
        modulos.add(contenido);
    }

    @Override
    public void mostrar() {
        System.out.println("[\n Curso: "+ nombre);
        for(Contenido m: modulos){
            m.mostrar();
        }

    }
}
