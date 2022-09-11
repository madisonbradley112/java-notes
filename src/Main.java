// Java Notes. These notes are adapted from the "Java notes for Professionals"
// from GoalKicker.com

public class Main {
    // This is the entry point for the program.
    // Public means that it can be called from anywhere, even outside of the program.
    // Static means that it exists and can be run by itself (without creating an object)
    // Void means that the function doesn't return anything.
    public static void main(String[] args) {
        // String[] args is an array of the arguments passed into the program (eg. by command line)

        /* Initialization and accessing objects */
        Member myMember = new Member("Jupiter", "dude", 10, 11);
        Team myTeam = new Team(myMember);
        System.out.println(myTeam.member.getName());
        System.out.println(myTeam.member.getType());
        System.out.println(myTeam.member.getLevel());
        System.out.println(myTeam.member.getRank());
    }

    public static void typeConversion() {
        /* Type conversion */

        // Implicit casting
        byte byteVar = 42;
        short shortVar = byteVar;
        int intVar = shortVar;
        long longVar = intVar;
        float floatVar = longVar;
        double doubleVar = floatVar;

        // Explicit casting
        // Must be done when the source type has larger range than target.
        // Note: When casting floats to whole numbers, the fractional part is truncated.
        double otherDouble = 42.0d;
        float otherFloat = (float) otherDouble;
        long otherLong = (long) otherFloat;
        int otherInt = (int) otherLong;
        short otherShort = (short) otherInt;
        byte otherByte = (byte) otherShort;

        // Numeric promotion
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
    }
}

