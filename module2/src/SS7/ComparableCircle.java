package SS7;
import SS6.Circle;

public class ComparableCircle implements Comparable<Circle>{

    @Override
    public int compareTo(Circle o){
        if(this.getRadius() > o.getRadius())
            return 1;
        else if(this.getRadius() < o.getRadius())
            return -1;
        else
            return 0;
    }
}
