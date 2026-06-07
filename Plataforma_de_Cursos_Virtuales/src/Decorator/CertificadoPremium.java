package Decorator;

public class CertificadoPremium extends CursoDecorator{

    public CertificadoPremium(CursoOnline curso){
        super(curso);
    }
    @Override
    public void descripcion() {
        curso.descripcion();
        System.out.println("+ Certificado Premium");

    }
}
