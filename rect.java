
public class rect {
    int length, breadth;

    rect() {
        length = 4;
        breadth = 5;
    }

    public static void main(String[] args) {
        rect obj = new rect();
        System.out.println("Area of rectangle is" + (obj.length * obj.breadth));
    }
}
