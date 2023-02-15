public class string_buffer {
    public static void main(String[] args) {
        StringBuffer obj = new StringBuffer("HELLO");
        System.out.println("String append:"+obj.append("World"));
        System.out.println("String reverse:"+obj.reverse());
        System.out.println("String Deletion:"+obj.delete(1, 3));
        System.out.println("String Searching index:"+obj.indexOf("H"));
        System.out.println("String Searching Char:"+obj.charAt(2));
        System.out.println("String length:"+obj.length());
    }
}
