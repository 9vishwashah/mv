class Child {
    int id;
    String name;
    int age;

    Child(int i, String n) {
        id = i;
        name = n;
    }

    Child(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + id + " " + age);
    }

    public class Constructor_overloading {

        public static void main(String[] args) {
            Child obj1 = new Child(24, "Sunflower");
            Child obj2 = new Child(25, "lili", 12);
            obj1.display();
            obj2.display();
        }
    }
}
