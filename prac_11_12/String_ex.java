public class String_ex {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = "HELLO";
        System.out.println("String searching char : "+s.charAt(2));
        System.out.println("String Joining: "+s.concat(s1));
        System.out.println("String equals Checking ignoring case: "+s.equalsIgnoreCase(s1));
        System.out.println("String equals Checking : "+s.equals(s1));
        System.out.println("String Length: "+s.length());
        System.out.println("String replacing: "+s.replace("Hello","Hey"));
        System.out.println("String substring: "+s.substring(2));
        System.out.println("String substring at index: "+s.substring(2,4));
        System.out.println("String Lowercase: "+s.toLowerCase());
        System.out.println("String Uppercase: "+s.toUpperCase());
        System.out.println("String trim: "+s.trim());
        System.out.println("String contains: "+s.contains(s1));
        System.out.println("String trim: "+s.trim());
    }
}
