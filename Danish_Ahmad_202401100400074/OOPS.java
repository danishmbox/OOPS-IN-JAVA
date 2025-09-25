public class OOPS {
    public static void main(String args[]){
         Pen p1=new Pen();
         p1.color="Yellow";
         p1.tip=5;
         System.out.println(p1.color);

         p1.changeColor("Blue");
         System.out.println(p1.color);

         Bankaccount acc1=new Bankaccount();
         acc1.username="Rahul";
         //acc1.password="abcde";
         acc1.setPassword("abcde");

     //    System.out.println(acc1.getPassword());

    }
}
class Pen{
    String color;
    int tip;

    void changeColor(String changecolor){
        color=changecolor;
    }
    void changeTip(int newtip){
        tip=newtip;
    }
}
class Student{
    String name;
    int age;
    double percentage;

    void calcMarks(int phy,int chem,int maths){
         percentage=(maths+phy+chem)/3*100;
    }
}

class Bankaccount{
   public  String username;
   private String password;

  public void setPassword(String newPassword){
    password= newPassword;
  }

    // public String getPassword(){
    //     return password;
    // }
  
}


