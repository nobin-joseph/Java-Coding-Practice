package Beginner;

public class Main{

    public static void main(String[] args){


        Main obj = new Main();
        obj.Print();
        B obj2 = new B();
     //   obj2.b1.Print();


    }

    public  void Print(){
        System.out.println("inside main method  and print function ");
    }
}

 class B{

     public void Print(){
         System.out.println("dnndn");
     }
     private  class b1{

         public  void Print(){
             System.out.println("hiiii");
         }
     }
}

class C {

    public void print(){
        System.out.println("dnndn");
    }
}