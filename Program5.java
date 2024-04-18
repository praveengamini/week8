public class Program5 {
    public static void main(String[] args) {
        // Integer
        int primitiveInt = 10;
        Integer wrapperInt = primitiveInt; // Autoboxing
        int unboxedInt = wrapperInt; // Autounboxing
        System.out.println("Integer Autoboxing: " + wrapperInt);
        System.out.println("Integer Autounboxing: " + unboxedInt);

        // Long
        long primitiveLong = 100L;
        Long wrapperLong = primitiveLong; 
        long unboxedLong = wrapperLong; 
        System.out.println("Long Autoboxing: " + wrapperLong);
        System.out.println("Long Autounboxing: " + unboxedLong);

        // Float
        float primitiveFloat = 10.5f;
        Float wrapperFloat = primitiveFloat;
        float unboxedFloat = wrapperFloat;
        System.out.println("Float Autoboxing: " + wrapperFloat);
        System.out.println("Float Autounboxing: " + unboxedFloat);

        // Double
        double primitiveDouble = 10.5;
        Double wrapperDouble = primitiveDouble; 
        double unboxedDouble = wrapperDouble; 
        System.out.println("Double Autoboxing: " + wrapperDouble);
        System.out.println("Double Autounboxing: " + unboxedDouble);

        // Character
        char primitiveChar = 'A';
        Character wrapperChar = primitiveChar; 
        char unboxedChar = wrapperChar; 
        System.out.println("Character Autoboxing: " + wrapperChar);
        System.out.println("Character Autounboxing: " + unboxedChar);

        // Boolean
        boolean primitiveBoolean = true;
        Boolean wrapperBoolean = primitiveBoolean; 
        boolean unboxedBoolean = wrapperBoolean; 
        System.out.println("Boolean Autoboxing: " + wrapperBoolean);
        System.out.println("Boolean Autounboxing: " + unboxedBoolean);

        // Byte
        byte primitiveByte = 100;
        Byte wrapperByte = primitiveByte; 
        byte unboxedByte = wrapperByte;
        System.out.println("Byte Autoboxing: " + wrapperByte);
        System.out.println("Byte Autounboxing: " + unboxedByte);
    }
}
