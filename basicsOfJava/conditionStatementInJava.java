import java.util.Scanner;
public class conditionStatementInJava {
    public static void main(String[] args) {
        // boolean isSunUp=true;
        // if(isSunUp){
        //     System.out.println("DAY");
        // }
        // else{
        //     System.out.println("NIGHT");
        // }

        // pen - 10 || notebook - 40 
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the amount of the cash you have:");
        // int cash=sc.nextInt();
        // if(cash<10){
        //     System.out.println("Cannot buy anything\nGet Some More Cash to continue shoping!");
        // }
        // else if(cash>10 && cash<50){
        //     System.out.println("Can get only one thing!");
        // }
        // else{
        //     System.out.println("You can buy both the items!");
        // }
        // sc.close();

        // Switch 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day number:");
        int day=sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number!");
        }
        sc.close();
    }
}
