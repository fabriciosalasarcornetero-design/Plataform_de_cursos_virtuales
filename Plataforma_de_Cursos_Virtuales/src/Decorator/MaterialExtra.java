package Decorator;

public class MaterialExtra extends CursoDecorator{

    public MaterialExtra(CursoOnline curso){
        super(curso);
    }

    @Override
    public void descripcion() {
        curso.descripcion();
        System.out.println("+ Material Extra ");
    }
}
