package classWork.music;

public class Piano extends Instrument {

    Piano(String name) {
        super(name);
    }
    @Override
    protected void playNote(char n){
        System.out.println("piano: "+n);
    }
}
