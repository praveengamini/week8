//Demonstrate pure abstraction using interfaces in Java.
interface  A {

    int a=10;//only initialization is possible acts as a final variable
    void displayHello();
    static void displayHi()//static methods can be defined in an interface
    {
        System.out.println("Hii");
    }
    
}
class B implements A{
    public void displayHello()//method have to be publicly implemented in the implemented class
    {
        System.out.println("hello");
    }
}   


public class Program2 {
    public static void main(String[] args) {
            B obj = new B();
            obj.displayHello();
            System.out.println(obj.a);// static methods can be accessed
            A.displayHi();
    }
}
