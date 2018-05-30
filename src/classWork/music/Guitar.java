package classWork.music;

public class Guitar extends Instrument {
    public Guitar(String s){
        super("Instrument");

    }
    @Override
    protected void playNote(char n){
        System.out.print("Guitar: "+n);
    }
}
