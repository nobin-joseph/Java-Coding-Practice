package Beginner;

public class Main{

    public static void main(String[] args) {
        Example obj = new Example();
         //obj.showMessage();
         obj.display(); // ✅ Allowed — indirectly calls private

    }




}

class Example {

    private void showMessage() {
        System.out.println("This is a private method");
    }

    public void display() {
        // ✅ Can access private method from inside the class
        showMessage();
    }

    class A{
        void Show(){
            System.out.println("inner class method");
        }
    }
}