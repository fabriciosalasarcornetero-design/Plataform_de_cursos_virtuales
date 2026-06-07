package Builder;

public class CertificadoBuilder {
    private String estudiante;
    private String curso;
    private String fecha;

    public CertificadoBuilder setEstudiante(String estudiante) {
        this.estudiante = estudiante;
        return this;
    }

    public CertificadoBuilder serCurso(String curso) {
        this.curso = curso;
        return this;
    }

    public CertificadoBuilder setFecha(String fecha) {
        this.fecha = fecha;
        return this;
    }

    public Certificado Builder() {
        return new Certificado(estudiante,curso,fecha);
    }
}
