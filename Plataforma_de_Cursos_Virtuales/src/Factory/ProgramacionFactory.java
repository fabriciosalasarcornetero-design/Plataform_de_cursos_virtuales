package Factory;

public class ProgramacionFactory extends CursoFactory{
    @Override
    public Curso crearCurso() {
        return new CursoProgramacion();
    }
}
