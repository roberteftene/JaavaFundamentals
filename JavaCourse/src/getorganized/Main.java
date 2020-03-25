package getorganized;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        //Variables
        int myVar;
        //System.out.println(myVar); // O: Error

        int anotherVar = 100;
        System.out.println(anotherVar); // O: 100

        myVar = anotherVar;
        System.out.println(myVar); // O :100

        anotherVar = 200;
        System.out.println(anotherVar); // O:200

        System.out.println(myVar); // O: 100

        //Primitive Data Types
        //Integer, Floating point, Character, Boolean

        //1byte = 8bits

        //Integer:
        // byte(8bits), short(16 bits), int(32bits) , long(64bits)

        //Floating Point Types:
        //float(32bits), double(64bits)

        //Character
        //char(16bits)

        //Boolean
        //boolean(1bit)

        //Primitive Types are stored by values

        //Prefix & Postfix

        int fix = 1;
        System.out.println(++fix); // (Prefix) -> O:2, fix = 2
        System.out.println(fix++); // (Postfix) -> O:2, fix = 1

        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result1 = valA - valB / valC;
        int result2 = (valA - valB) / valC;

        System.out.println(result1 + "-> result1\n"  + result2 + "->result2");

        int result3 = valA / valC * valD + valB;
        int result4 = valA / (valC * (valD + valB));

        System.out.println(result3 +  " -> result3");
        System.out.println(result4 +  " -> result4");

        //Type Conversion

        //Implicit type conversion
        int iVal = 50;
        long lVal = iVal;

        //Explicit type conversion
        long LVal = 50;
        int IVAL = (int) LVal;

        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result = byteVal;
        short resul = (short) longVal;
        short res = (short) (byteVal - longVal);
        long resu = (long) (longVal - floatVal);
        long re = (long) (shortVal - longVal + floatVal + doubleVal);

        int v1 = 7;
        int v2 = 5;
        int vMax = v1 > v2? v1:v2;
        System.out.println(vMax);

        int students = 150;
        int rooms = 0;
        if(rooms > 0 & students/rooms > 30)
            System.out.println("Crowded!");

    }
}
