package SS6;

public class shape {
    private String color= "green";
    private boolean filled= true;

    public shape(){
    }

    public shape (String color, boolean filled){
        this.color= color;
        this.filled= filled;
    }

    public String getColor(){
        return color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled= filled;
    }

    @Override
    public String toString() {
        return "A shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }

}
