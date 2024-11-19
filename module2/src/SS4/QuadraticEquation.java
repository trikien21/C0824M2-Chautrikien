package SS4;

public class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation(){
    }

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        return b*b - 4*a*c;
    }

    public double getRoot1(){
        double delta= getDiscriminant();
        if(delta < 0){
            return 0;
        }
        return (-b+Math.sqrt(delta)) / (2*a);
    }

    public double getRoot2(){
        double delta= getDiscriminant();
        if(delta < 0){
            return 0;
        }
        return (-b-Math.sqrt(delta)) / (2*a);
    }
}
