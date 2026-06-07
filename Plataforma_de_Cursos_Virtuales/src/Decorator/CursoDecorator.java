package Decorator;

public abstract class CursoDecorator implements CursoOnline{
    protected CursoOnline curso;

    public CursoDecorator(CursoOnline curso){
        this.curso = curso;
    }
}
