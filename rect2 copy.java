

public class rect2 {
    int length, breadth;
    
    rect2(int l, int b){
        length = l;
        breadth = b;
    }

    public static void main(String[] args) {
        rect2 obj = new rect2(5, 6);
        System.out.println("Area:"+(obj.length*obj.breadth));
    }

}
