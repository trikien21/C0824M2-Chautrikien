package SS4;

public class class_rectangle {
    double width, height;
    public class_rectangle(){
    }

    public class_rectangle(double width, double height){
        this.width= width;
        this.height= height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }

    public String display(){
        return "Rectangle{" + "width= "+ width +", height= "+ height+ "}";
    }


}
