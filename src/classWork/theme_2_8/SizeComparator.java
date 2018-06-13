package classWork.theme_2_8;

import java.util.Comparator;

public class SizeComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        return Double.compare(o1.getSize(),o2.getSize());
    }
}
