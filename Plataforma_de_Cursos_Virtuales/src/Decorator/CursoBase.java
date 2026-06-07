package Decorator;

public class CursoBase implements CursoOnline{
    @Override
    public void descripcion() {
        System.out.println("Curso basico ");
    }
}
