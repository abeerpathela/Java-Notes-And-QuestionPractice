import java.util.Arrays;
public class ArraysInJava {
    public static void main(String[] args){

        int[] marks= new int[3];
        marks[0]=99;
        marks[1]=98;
        marks[2]=97;

        // length

        System.out.println(marks.length);

        // sort

        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        // another method of array declaration

        char[] letters={'A','B','C','D'};
        System.out.println(letters[0]);
    }
}
