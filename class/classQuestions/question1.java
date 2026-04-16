import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=ab.nextLine();
        System.out.println("Hello "+name+",");
        System.out.println("Enter Physics marks:");
        int phy=ab.nextInt();
        System.out.println("Enter Chemistry marks:");
        int chem=ab.nextInt();
        System.out.println("Enter Mathematics marks:");
        int math=ab.nextInt();
        int sum=phy+chem+math;
        int avg=sum/3;
        if(avg>=60){
            System.out.println("Eligible!");
        }
        else{
            System.out.println("Not Eligible!");
        }
        ab.close();
    }
}
