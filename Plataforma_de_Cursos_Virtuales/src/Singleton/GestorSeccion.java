package Singleton;

public class GestorSeccion {
    private static GestorSeccion instancia;
    private GestorSeccion(){}
    public static synchronized GestorSeccion getInstance() {
        if (instancia == null) {
            instancia = new GestorSeccion();
        }
        return instancia;
    }
    public void iniciarSeccion(String usuario){
        System.out.println(usuario + " Inicio Sesion.");
    }
}
