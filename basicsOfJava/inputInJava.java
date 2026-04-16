import java.util.Scanner;
public class inputInJava {
    public static void main(String[] args){
        Scanner ab= new Scanner(System.in);
        int num=ab.nextInt();
        System.out.println("The enterd number is : "+num);
        float f1=ab.nextFloat();
        System.out.println("The entered float number is: "+f1);
        String s=ab.next();
        System.out.println("The entered string is: "+s);
        ab.nextLine(); // to consume the newline character
        String s1=ab.nextLine();
        System.out.println("The entered line is: "+s1);
        Boolean b1=ab.nextBoolean();
        System.out.println("The entered boolean value is: "+b1);
        ab.close();  // to close the scanner 
    }
}
