package Factory;

public class DiseñoFactory extends CursoFactory {
    @Override
    public Curso crearCurso() {
        return new CursoDiseño();
    }
}
