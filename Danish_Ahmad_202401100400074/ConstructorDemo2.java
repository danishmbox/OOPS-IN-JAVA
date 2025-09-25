public class ConstructorDemo2 {
    public static void main(String args[]){
       Student s1=new Student();
       Student s2=new Student("Aditi");
       Student s3=new Student (23);
     //  Student s4=new Student("Aditi",23);

     Student s4=new Student("Adam");
     s4.roll=23;
     s4.password="ABCD";
     Student s5=new Student(s4);
     s5.password="XYZ";
    }
}
class Student{
    String name;
    int roll;
    String password;

    Student(){
        System.out.println("constructor is called");
    }

    Student(String name){
        this.name=name;
    }

    Student(int roll){
        this.roll=roll;
    }

    Student(Student s4){
        this.name=s4.name;
        this.roll=s4.roll;
    }
}
