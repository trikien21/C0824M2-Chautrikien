package SS7;
import SS6.Circle;

import java.util.Arrays;
import java.util.Comparator;
public class CircleComparatorTest {
    public static void main(String[] args){
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted: ");
        for(Circle Circle: circles){
            System.out.println(Circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted: ");
        for(Circle Circle: circles) {
            System.out.println(Circle);
        }
    }
}
