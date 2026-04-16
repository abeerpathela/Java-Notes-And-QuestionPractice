import java.util.Stack;

public class stack {
    public static void main(String[] args){
        Stack<String>animals=new Stack<>(); // decleration of stack 
		
		animals.push("lion"); // this is to put the element on the top of the stack 
		animals.push("cat");
		animals.push("dog");
		animals.push("dinosaur");
		
		System.out.println(animals); // this prints the whole stack 
		
		System.out.println(animals.peek()); // this prints the top most element of the stack 
		
		animals.pop(); // this removes the top most element of the stack 
		
		System.out.println(animals.peek());
    }
}
