public class functionInJava {
    public static void helloWorld(){
        System.out.println("Hello World!");
    }

    public static void printName(String name){
        System.out.println("Your name is: "+name);
    }

    public static int sum(int a, int b){
        int temp;
        temp=a+b;
        return temp;
    }
    public static void main(String[] args){
        System.out.println(sum(1,2));
    }
}
