package classWork.music;

public class Drum extends Instrument{

    public Drum(String name) {
        super(name);
    }

    @Override
    protected void playNote(char n) {
        System.out.println("Drum: "+n);
    }
}