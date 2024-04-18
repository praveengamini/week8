//Demonstrate partial abstraction in Java.
abstract class A{  //class has to be abtract if atleast one of the method is abstract
    void displayHello()
    {
        System.out.println("Hello");
    }
   abstract void displayHi();
}
class B extends A{//it is mandatory to implement or override the declared method in parent class if it is inheriting
    void displayHi()
    {
        System.out.println("Hi");
    }

}
public class Program1 {

    public static void main(String[] args) {
        B obj = new B();  // we can't instantiate the object for abstract class
        obj.displayHello();
        obj.displayHi();
    }
}