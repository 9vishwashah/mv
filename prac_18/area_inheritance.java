class Area {
    public int area_room(int length, int breadth) {
        return length * breadth;
    }

}

class room extends Area {

    public int volume(int length, int width, int height) {
        return length * width * height;
    }
}

class area_inheritance {
    public static void main(String args[]) {
        room obj = new room();
        System.out.println("Area of rectangle is: " + obj.area_room(2, 4));
        System.out.println("Volume of rectangle is: " + obj.volume(4, 5, 6));

    }
}