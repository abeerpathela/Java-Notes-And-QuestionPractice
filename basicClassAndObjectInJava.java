class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }

    public void getInfo(){
        System.out.println("Color of pen: "+color+"\n"+"Type of pen: "+type+"\n");
    }
}
public class basicClassAndObjectInJava {
    public static void main(String[] args) {
        Pen a= new Pen();
        a.color="blue";
        a.type="ball pen";
        a.getInfo();
    }
}
