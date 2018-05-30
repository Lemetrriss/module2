package classWork.music;

public abstract class Instrument {

    private String name;

    Instrument(String name) {
        this.name = name;
    }

    protected abstract void playNote(char n);

    public void play(String str){
        System.out.println(name);
        for (int i = 0; i < str.length(); i++)
            playNote(str.charAt(i));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>1) {
            this.name = name;
        }
    }
}
