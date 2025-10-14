package Beginner;

class Main {


    public static void main(String[] args) {


        A obj = new B();
    }
}

class A {
    public void show() {
        System.out.println("this id in class A ");
    }
}

class B extends A{

    public void show(){
        System.out.println("this id in class B ");
    };

}