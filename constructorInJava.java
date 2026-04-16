class Student{
    String name;
    int rollno;

    Student(){                      // non parameterized constructor
        System.out.println("Constructor called!");
    }

    Student(String name,int rollno){    // parameterized constructor 
        this.name=name;
        this.rollno=rollno;
    }

    Student(Student obj){      // copy constructor 
        this.name=obj.name;
        this.rollno=obj.rollno;
    }

    public void printInfo(){
        System.out.println("Name of Student: "+name+"\n"+"Roll No of Student: "+rollno+"\n");
    }

}
public class constructorInJava {
    public static void main(String[] args){
        Student a=new Student("Abeer Pathela",1014);
        a.printInfo();
    }
}
