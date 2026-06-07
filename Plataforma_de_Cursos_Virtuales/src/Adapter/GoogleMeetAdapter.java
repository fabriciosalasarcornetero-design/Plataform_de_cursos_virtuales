package Adapter;

public class GoogleMeetAdapter implements PlataformaVideo{
    private GoogleMeet meet;

    public GoogleMeetAdapter(GoogleMeet meet){

        this.meet = meet;
    }


    @Override
    public void conectar() {
        meet.iniciarMeet();

    }
}
