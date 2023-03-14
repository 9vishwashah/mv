public class Method_overloading {
    public int sum(int x, int y, int z) {
        return (x + y + z);
    }

    public int sum(int x, int y) {
        return (x + y);
    }

    public double sum(double  x, double y) {
        return (x + y);
    }

    public static void main(String[] args) {
        Method_overloading obj = new Method_overloading();
        System.out.println(obj.sum(4, 5));
        System.out.println(obj.sum(4, 5, 8));
        System.out.println(obj.sum(4.9, 5.8));

    }

}
