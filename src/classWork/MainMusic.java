package classWork;

import classWork.music.*;
//import classWork.music.Guitar;
//import classWork.music.Instrument;

public class MainMusic {
    public static void main(String[] args) {
        Instrument a = new Guitar("ЧЯ");
//        a.setName("Petya");
        a.setName("P");
        a.play("Play melody");

        Instrument b = new Guitar("Vasya");
        b.setName("Arnold");
        b.setName("");
        b.play("Play jfhfhgyj");
        Guitar g = new Guitar("");
        g.play("igraj");
        Drum d = new Drum("Class Drum");
        d.play("play Drum");
    }
}