public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int c = 0;
        for (int i = 0; i <= 10; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
