package SS5;

public class static_method {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    static_method(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

