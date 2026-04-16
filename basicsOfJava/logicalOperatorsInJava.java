import java.util.Scanner;
public class logicalOperatorsInJava {
    public static void main(String[] args){
        int a=10;
        int b=20;
        System.out.println("Enter a number to check if it is in between a and b :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>=a && num<=b){
            System.out.println("Number is in range!");
        }
        else{
            System.out.println("Number is out of range!");
        }
        sc.close();
    }
}
