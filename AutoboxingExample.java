package Demo;

public class AutoboxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Auto boxing: Converting primitive types into wrapper objects
        
        // Byte
        byte b = 10;
        Byte byteObj = b;
        
        // Short
        short s = 20;
        Short shortObj = s;
        
        // Integer
        int i = 30;
        Integer intObj = i;
        
        // Long
        long l = 40L;
        Long longObj = l;
        
        // Float
        float f = 50.5f;
        Float floatObj = f;
        
        // Double
        double d = 60.6;
        Double doubleObj = d;
        
        // Character
        char c = 'A';
        Character charObj = c;
        
        // Boolean
        boolean bool = true;
        Boolean boolObj = bool;
        
        // Displaying the Wrapper Objects
        System.out.println("Byte Object: " + byteObj);
        System.out.println("Short Object: " + shortObj);
        System.out.println("Integer Object: " + intObj);
        System.out.println("Long Object: " + longObj);
        System.out.println("Float Object: " + floatObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Character Object: " + charObj);
        System.out.println("Boolean Object: " + boolObj);
 
	}

}

/* Byte Object: 10
Short Object: 20
Integer Object: 30
Long Object: 40
Float Object: 50.5
Double Object: 60.6
Character Object: A
Boolean Object: true
*/