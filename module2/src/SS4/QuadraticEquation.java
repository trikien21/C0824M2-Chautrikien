package SS4;

public class QuadraticEquation {
    double a, b, c;
    private QuadraticEquation(){
    }

    private QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        return b*b - 4*a*c;
    }

    public double getRoot1(){
        return (-b+(b*b-4*a*c)/(b*b-4*a*c))/(2*a);
    }

    public double getRoot2(){
        return (-b-(b*b-4*a*c)/(b*b-4*a*c))/(2*a);
    }
}
