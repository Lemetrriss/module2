package classWork.music;

public class Guitar extends Instrument {

    public Guitar(String name){

        super(name);
    }

    @Override
    protected void playNote(char n){
        System.out.print("Guitar: "+n);
    }
}
