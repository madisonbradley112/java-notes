import java.util.Calendar;
import java.util.Date;

public abstract class TypeConversion {

    // This class has only one method, and the method is used to explain conversion.
    // The method is not meant to be called.
    private static void conversion() {
        /* Implicit casting */
        byte byteVar = 42;
        short shortVar = byteVar;
        int intVar = shortVar;
        long longVar = intVar;
        float floatVar = longVar;
        double doubleVar = floatVar;

        /* Explicit Casting */
        // Must be done when the source type has larger range than target.
        // Note: When casting floats to whole numbers, the fractional part is truncated.
        double otherDouble = 42.0d;
        float otherFloat = (float) otherDouble;
        long otherLong = (long) otherFloat;
        int otherInt = (int) otherLong;
        short otherShort = (short) otherInt;
        byte otherByte = (byte) otherShort;

        /* Numeric Promotion */
        char char1 = 1, char2 = 2;
        short short1 = 1, short2 = 2;
        int int1 = 1, int2 = 2;
        float float1 = 1.0f, float2 = 2.0f;

        // char1 = char1 + char2;   // Error: cannot convert from int to char
        // short1 = short1 + short2 // Error: cannot convert from int to short;
        int1 = char1 + char2;       // char is promoted to int
        int1 = short1 + short2;     // short is promoted to int
        int1 = char1 + short2;      // both char and short promoted to int
        float1 = short1 + float2;   // short is promoted to float
        int1 = int1 + int2;         // int is unchanged.

        /* Non-numeric type casting */
        // Note: Booleans cannot be cast to/from any primitive type.
        // Chars are cast to/from any numeric type using Unicode.
        // int badInt = (int) true; // Compiler error!
        char a =    (char)      65;     // A
        byte b =    (byte)      'A';    // 65
        short c =   (short)     'A';    // 65
        int d =     (int)       'A';    // 65

        char e =    (char)      8253;   // ‽
        byte f =    (byte)      '‽';    // 61 (truncated into ASCII
        short g =   (short)     '‽';    // 8253
        int h =     (int)       '‽';    // 8253

        /* Object casting */
        // Objects can be cast both explicitly and implicitly.
        // Implicit casting only happens when the source extends or implements the target.
        // Explicit casting must be done when the source type is extended or implemented by the target.
        Float floatType = new Float(42.0f);
        Number n = floatType;               // Implicit casting
        Float floatType2 = (Float) n;       // Explicit casting
        // Double doubleType = (Double) n;  // throws exception (object is not double)

        /* Testing whether objects can be cast using 'instanceof' */
        // The instanceof operator is provided to test if an object is of a certain type, or subclass of the type.
        Object obj = Calendar.getInstance();
        long time = 0;

        if (obj instanceof Date) {
            time = ((Date) obj).getTime();
        }
    }
}
