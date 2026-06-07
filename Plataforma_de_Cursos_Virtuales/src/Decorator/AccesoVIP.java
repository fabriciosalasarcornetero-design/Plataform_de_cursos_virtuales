package Decorator;

public class AccesoVIP extends CursoDecorator{

    public AccesoVIP(CursoOnline curso){
        super(curso);
    }
    @Override
    public void descripcion() {
        curso.descripcion();
        System.out.println("+ Acceso VIP");
    }
}
