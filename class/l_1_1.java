import java.util.Scanner;
public class l_1_1 {
    public static void main(String[] args) {
        Scanner ab= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1=ab.nextInt();
        System.out.println("Enter second number: ");
        int num2=ab.nextInt();
        int sum=num1+num2;
        System.out.println("The sum of two numbers is: "+sum);
        System.out.println("Before Swapping:");
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swapping:");
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
        ab.close();
    }

}
