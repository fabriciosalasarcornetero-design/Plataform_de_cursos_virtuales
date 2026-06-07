package App;

import Adapter.*;
import Builder.Certificado;
import Builder.DirectorCertificado;
import Composite.CursoComposite;
import Composite.Leccion;
import Composite.Modulo;
import Decorator.*;
import Factory.Curso;
import Factory.CursoFactory;
import Factory.ProgramacionFactory;
import Singleton.GestorSeccion;

public class Main {
    public static void main(String [] args){
        System.out.println("[---FACTORY---]");
        CursoFactory factory=
                new ProgramacionFactory();
        Curso curso = factory.crearCurso();
        curso.mostrarCurso();
        System.out.println("[---SINGLETON---]");

        GestorSeccion.getInstance()
                .iniciarSeccion("Carlos");
        GestorSeccion.getInstance()
                        .iniciarSeccion("luis ");


        System.out.println("[---BUILDER---]");

        DirectorCertificado director =
                new DirectorCertificado();

        Certificado certificado =
                director.crearCertificado(
                        "Carlos",
                        "Java Avanzado",
                        " 22/07/2026");
        Certificado certificado1 =
                director.crearCertificado(
                        "Luis",
                        "Redes de computadora",
                        "20/07/2026"
                );
        System.out.println(certificado1);

        System.out.println(certificado);

        System.out.println("[---COMPOSITE---]");

        Leccion l1 =
                new Leccion("POO");
        Leccion l2 =
                new Leccion("Patrones de Diseño");
        Modulo modulo1 =
                new Modulo("Java");
        modulo1.agregar(l1);
        modulo1.agregar(l2);
       CursoComposite cursoCompleto =
                new CursoComposite("Java Intell");

        cursoCompleto.agregar(modulo1);

        cursoCompleto.mostrar();

        System.out.println("[---ADAPTER---");

        PlataformaVideo zoom =
                new ZoomAdapter(new Zoom());

        zoom.conectar();

        PlataformaVideo meet =
                new GoogleMeetAdapter(
                        new GoogleMeet());

        meet.conectar();

        System.out.println("[---DECORATOR---");

        CursoOnline premium =
                new AccesoVIP(
                        new MaterialExtra(
                                new CertificadoPremium(
                                        new CursoBase()
                                )
                        )
                );

        premium.descripcion();
    }
}