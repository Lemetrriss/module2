package classWork.theme_2_8;

public class InvalidShapeStringException extends Exception {

    String s;

    public InvalidShapeStringException(String s) {
        this.s = s;
    }
}
