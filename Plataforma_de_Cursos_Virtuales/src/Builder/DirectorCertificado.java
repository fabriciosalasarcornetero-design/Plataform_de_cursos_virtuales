package Builder;

public class DirectorCertificado {
    public Certificado crearCertificado(String estudiante, String curso, String fecha){
        return  new CertificadoBuilder()
                .setEstudiante(estudiante)
                .serCurso(curso)
                .setFecha(fecha)
                .Builder();
    }

}
