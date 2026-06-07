package Adapter;

public class ZoomAdapter implements PlataformaVideo{
    private Zoom zoom;

    public ZoomAdapter(Zoom zoom){

        this.zoom = zoom;
    }

    @Override
    public void conectar() {
        zoom.conectarZoom();

    }
}
