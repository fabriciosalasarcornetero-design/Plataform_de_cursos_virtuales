package Builder;

public class Certificado {
    private String estudiante;
    private String curso;
    private String fecha;

    public Certificado(String estudiante, String curso, String fecha) {
        this.estudiante = estudiante;
        this.curso = curso;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return " \n Certificado \n" +
                "estudiante:" + estudiante +
                "\n curso: " + curso +
                "\n fecha: " + fecha;
    }
}
