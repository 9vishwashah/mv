class one {
    public void d1() {
        System.out.println("Sunflower");
    }
}

class two extends one {
    public void d2() {
        System.out.println("Ray");
    }
}

class three extends two {
    public void d3() {
        System.out.println("Hope");
    }
}

// Drived class
public class Multilevel_Inherit {
    public static void main(String[] args) {
        three obj = new three();
        obj.d1();
        obj.d2();
        obj.d3();
    }
}
