public class ConstructorDemo {
    public static void main(String args[]){
      Student s2=new Student();
      Student s1=new Student("Ananya");
      Student s3=new Student(123);
      //Student s4=new Student("Ananya",122);

      Student s4=new Student();
      s4.name="Neha";
      s4.roll=344;
      s4.password="ABC";
      s4.marks[0]=80; 
      s4.marks[1]=90;
      s4.marks[2]=100;

      Student s5=new Student(s4);
      s5.password="XYC";
      s4.marks[2]=85;
      for(int i=0;i<3;i++){
        System.out.println(s5.marks[i]);
      }

    }
    
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    Student(){
       marks=new int[3];
        System.out.println("Constructor called");
    }
    Student(String name){ //constructor
      marks=new int[3];   
      this.name=name;  //initialise fields

    }
    Student(int roll){   //shallow copy
        marks=new int[3];
        this.roll=roll;
    }
    // Student(Student s4){
    //     marks=new int[3];
    //     this.name=s4.name;
    //     this.roll=s4.roll;
    //     this.marks=s4.marks;
    // }

    Student(Student s4){     //deep copy
        marks=new int[3];
        this.name=s4.name;
        this.roll=s4.roll;
        for(int i=0;i<3;i++){
            this.marks[i]=s4.marks[i];
        }
    }

}