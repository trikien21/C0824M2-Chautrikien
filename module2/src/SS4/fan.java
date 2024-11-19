package SS4;

public class fan {
    final int Slow= 1;
    final int Medium= 2;
    final int Fast= 3;
    private int speed= Slow;
    private boolean on= false;
    private double radius= 5;
    private String color= "blue";

    public fan(){

    }

    public int getSlow(){
        return Slow;
    }

    public int getMedium(){
        return Medium;
    }

    public int getFast(){
        return Fast;
    }

    public int getSpeed(){
        return speed;
    }

    public void getSpeed(int speed){
        this.speed= speed;
    }

    public boolean isOn(){
        return on;
    }

    public void setOn(boolean on){
        this.on= on;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius= radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color= color;
    }
    @Override
    public String toString(){
        if(on){
            return "Fan is on with speed "+ speed+ ", color "+ color+ ", and radius "+ radius;
        }else{
            return "Fan is off with color"+ color+" and radius "+ radius;
        }
    }

    public static void main(String[] args){
        fan fan1= new fan();
        fan1.getSpeed(fan1.getFast());
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

    }
}
