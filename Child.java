public class Child {
    int id;
    String name;
    int age;

    Child(int i, String s) {
        id = i;
        name = s;
    }

    Child(int i, String s, int a) {
        id = i;
        name = s;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Child obj1 = new Child(12, "vishwa");
        Child obj2 = new Child(143, "Sunflowe", 30);
        obj1.display();
        obj2.display();
    }

}
