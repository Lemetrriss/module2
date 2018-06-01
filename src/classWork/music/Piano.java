package classWork.music;

public class Piano extends Instrument {

    public Piano(String name) {

        super(name);
    }

    @Override
    protected void playNote(char n){
        System.out.print("piano: "+n);
    }
}
