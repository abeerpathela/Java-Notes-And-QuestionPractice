public class StringsInJava {
    public static void main(String[] args){

        // Concatenate

        String a="QWERTY";
        String b="UIOP";
        String c=a+b;
        System.out.println(c);

        // charat

        String d="Abeer Pathela";
        System.out.println(d.charAt(0));

        // length

        System.out.println(d.length());

        // replace 

        String e="Abe*r Pathela";
        String f=e.replace('*','e');
        System.out.println(f);

        // substring

        String fruits="Apple and Banana";
        System.out.println(fruits.substring(0,5));
    }
}
