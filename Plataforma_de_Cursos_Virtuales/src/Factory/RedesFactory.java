package Factory;

public class RedesFactory extends CursoFactory{
    @Override
    public Curso crearCurso() {
        return new CursoRedes();
    }
}
