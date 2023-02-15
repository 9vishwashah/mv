// import javax.sound.midi.Soundbank;

// package prac_10;

class Para_constructor {
       String name;
       int id; 
        

    Para_constructor(String name, int id){
        this.name = name;
        this.id = id;
    }

}

public class ParamConst {
    public static void main(String[] args) {
        Para_constructor obj = new Para_constructor("VISHWA", 24);
        System.out.println("name "+obj.name+" and id "+ obj.id);
    }
} 

