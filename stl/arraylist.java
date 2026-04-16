import java.util.ArrayList; 
import java.util.Iterator;
public class arraylist {
    	public static void main(String[] args) {
		ArrayList<String>studentsName = new ArrayList<>();
		studentsName.add("Rakesh"); // add the new elements at the end of the list 
		studentsName.add(0,"asdf"); // add the new element at the given index (0)
		System.out.println(studentsName); // prints the whole list 
		ArrayList<String>studentsName2 = new ArrayList<>();
		studentsName2.addAll(studentsName); // add the all the elements of the given list in the new list formed 
		System.out.println(studentsName2);
		System.out.println(studentsName2.get(0)); // get method prints whatever is present on the mentioned index (0)
		studentsName2.remove(1);  // this removes the element from the list on the index which is mentioned (1)
		System.out.println(studentsName2);
		studentsName2.remove("asdf"); // this removes the element by finding it by value in the list  
		System.out.println(studentsName2);
		studentsName2.clear();// this clears the whole list 
		System.out.println(studentsName2);
		System.out.println(studentsName.contains("Rakesh")); // this returns true false that the element exists in the list or not 
		
		// iterationing through the list 
		
        // for loop                                 
		for(int i=0; i<studentsName.size(); i++){
		    System.out.println(studentsName.get(i));
		}
		
		// for each loop 
		for(String i:studentsName){
		    System.out.println(i);
		}
		
		// through iterator 
		Iterator<String>it=studentsName.iterator();
		while(it.hasNext()){
		    System.out.println(it.next());
		}
	}
}
