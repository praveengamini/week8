public class Program6 {
    public static void main(String[] args) {
        System.out.println("the address of the same Integer object for different values: ");
        Integer intObj1 = 10;
        System.out.println(System.identityHashCode(intObj1));
        intObj1 = 11;
        System.out.println(System.identityHashCode(intObj1));
        System.out.println("hence Integer is immutable");

        System.out.println("\nthe address of the same Long object for different values: ");
        Long longObj1 = 100L;
        System.out.println(System.identityHashCode(longObj1));
        longObj1 = 200L;
        System.out.println(System.identityHashCode(longObj1));
        System.out.println("hence Long is immutable");

        System.out.println("\nthe address of the same Float object for different values: ");
        Float floatObj1 = 10.5f;
        System.out.println(System.identityHashCode(floatObj1));
        floatObj1 = 20.5f;
        System.out.println(System.identityHashCode(floatObj1));
        System.out.println("hence Float is immutable");

        System.out.println("\nthe address of the same Double object for different values: ");
        Double doubleObj1 = 10.5;
        System.out.println(System.identityHashCode(doubleObj1));
        doubleObj1 = 20.5;
        System.out.println(System.identityHashCode(doubleObj1));
        System.out.println("hence Double is immutable");

        System.out.println("\nthe address of the same Character object for different values: ");
        Character charObj1 = 'A';
        System.out.println(System.identityHashCode(charObj1));
        charObj1 = 'B';
        System.out.println(System.identityHashCode(charObj1));
        System.out.println("hence Character is immutable");

        System.out.println("\nthe address of the same Boolean object for different values: ");
        Boolean boolObj1 = true;
        System.out.println(System.identityHashCode(boolObj1));
        boolObj1 = false;
        System.out.println(System.identityHashCode(boolObj1));
        System.out.println("hence Boolean is immutable");
        System.out.println("the address of the same String object for different values: ");
        String strObj1 = "Hello";
        System.out.println(System.identityHashCode(strObj1));
        strObj1 = "World";
        System.out.println(System.identityHashCode(strObj1));
        System.out.println("hence String is immutable");
    }
}
