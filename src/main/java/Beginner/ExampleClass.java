package Beginner;

public class ExampleClass {

    public static void main(String[] a){

        Cars obj1 = new Cars("BMW","black","55L");
        Cars obj2 = new Cars("BENZ","RED","40L");
        display(obj1);
        display(obj2);
    }

    public static void display(Cars obj){
        System.out.println(obj.brand);
        System.out.println(obj.color);
        System.out.println(obj.price);
    }

}

class Cars{
    String brand, color, price;

    Cars(String brand,String color,String price){
        this.brand=brand;
        this.color= color;
        this.price=price;
    }

}