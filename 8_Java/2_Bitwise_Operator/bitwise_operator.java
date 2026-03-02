public class bitwise_operator {
    public static void main(String[] args){

        // Bitwise OR -> '|'
        // Bitwise AND -> '&'
        // Bitwise EXCLUSIVE OR -> '^'
        // Bitwise NOT -> '~'
        // SHIFT RIGHT -> '>>'
        // SHIFT LEFT -> '<<'
        // SHIFT RIGHT WITH ZERO FILL -> '>>>'
        // SHIFT LEFT WITH ZERO FILL -> '<<<'


/*
=====================================================
        JAVA BITWISE OPERATORS - DETAILED NOTES
=====================================================
*/

/*
1. Introduction:
----------------
Bitwise operators Java me integers (byte, short, int, long) ke bits par kaam karte hain.
Ye operators binary digits (0 aur 1) ko directly manipulate karte hain.

Java me total 7 bitwise operators hote hain:

1. AND         (&)
2. OR          (|)
3. XOR         (^)
4. Complement  (~)
5. Left Shift  (<<)
6. Right Shift (>>)
7. Unsigned Right Shift (>>>)
*/

/*
2. Bitwise AND (&)
-------------------
- Syntax: result = a & b;
- Kaam: dono operands ke corresponding bits ko AND karta hai
- Rule: 1 & 1 = 1, 1 & 0 = 0, 0 & 1 = 0, 0 & 0 = 0
- Use case: Masking bits, check karna ki specific bit ON hai ya nahi
*/
int andA = 12; // 1100 in binary
int andB = 10; // 1010 in binary
int andResult = andA & andB; // 1000 in binary
System.out.println("12 & 10 = " + andResult); // Output: 8

/*
3. Bitwise OR (|)
------------------
- Syntax: result = a | b;
- Kaam: dono operands ke corresponding bits ko OR karta hai
- Rule: 1 | 1 = 1, 1 | 0 = 1, 0 | 1 = 1, 0 | 0 = 0
*/
int orResult = andA | andB; // 1110 in binary
System.out.println("12 | 10 = " + orResult); // Output: 14

/*
4. Bitwise XOR (^)
-------------------
- Syntax: result = a ^ b;
- Kaam: dono operands ke corresponding bits ko XOR karta hai
- Rule: 1 ^ 1 = 0, 1 ^ 0 = 1, 0 ^ 1 = 1, 0 ^ 0 = 0
*/
int xorResult = andA ^ andB; // 0110 in binary
System.out.println("12 ^ 10 = " + xorResult); // Output: 6

/*
5. Bitwise Complement (~)
-------------------------
- Syntax: result = ~a;
- Kaam: har bit ko invert karta hai (1 -> 0, 0 -> 1)
- Note: Java me integers 32-bit hote hain, aur complement ka result negative me aa sakta hai
*/
int compResult = ~andA;
System.out.println("~12 = " + compResult); // Output: -13

/*
6. LEFT SHIFT (<<)
------------------
- Syntax: result = a << n;
- Kaam: a ke bits ko left shift karta hai n positions tak
- Right side me 0 fill hota hai
- Equivalent to multiplying by 2^n (for positive integers)
*/
int shiftA = 12; // Binary: 00001100
int leftShift = shiftA << 2; // Shift 2 positions left
System.out.println("12 << 2 = " + leftShift); // Output: 48

/*
Step by Step:
Original 12 in 8-bit binary: 00001100
Shift left by 2 bits:       00110000
Explanation: 
- Left shift moves all bits 2 positions to left
- Rightmost 2 bits filled with 0
- Decimal value: 48
*/

/*
7. RIGHT SHIFT (>>)
--------------------
- Syntax: result = a >> n;
- Kaam: a ke bits ko right shift karta hai n positions tak
- Left side me sign bit fill hoti hai
- Equivalent to dividing by 2^n (floor division)
*/
int shiftB = 12; // Positive number
int rightShiftPos = shiftB >> 2; // 12 >> 2
System.out.println("12 >> 2 = " + rightShiftPos); // Output: 3

int shiftC = -12; // Negative number
int rightShiftNeg = shiftC >> 2;
System.out.println("-12 >> 2 = " + rightShiftNeg); // Output: -3

/*
8. UNSIGNED RIGHT SHIFT (>>>)
-------------------------------
- Syntax: result = a >>> n;
- Kaam: bits ko right shift karta hai, left me 0 fill hota hai
- Sign ignore hoti hai
*/
int shiftD = -12;
int unsignedRightShift = shiftD >>> 2;
System.out.println("-12 >>> 2 = " + unsignedRightShift); // Output: 1073741821

/*
Summary:
---------
Operator  | Leftmost bits fill | Example (-12)
----------|------------------|----------------
>>        | Sign bit          | -12 >> 2 = -3
>>>       | 0                 | -12 >>> 2 = 1073741821
<<        | 0 (right fill)   | 12 << 2 = 48

Tips:
- Left shift (<<) = multiply by 2^n
- Right shift (>>) = divide by 2^n
- Unsigned right shift (>>>) = logical shift, ignore sign
*/

/*
9. Summary Table:
-----------------
Operator | Symbol | Description
---------|--------|------------
AND      | &      | Sets each bit to 1 if both bits are 1
OR       | |      | Sets each bit to 1 if one of the bits is 1
XOR      | ^      | Sets each bit to 1 if only one bit is 1
Complement | ~    | Inverts all bits
Left Shift | <<    | Shifts bits left, fills 0
Right Shift | >>   | Shifts bits right, fills sign bit
Unsigned Right Shift | >>> | Shifts bits right, fills 0

/*
10. Tips:
----------
- Bitwise operators sirf integer types par kaam karte hain.
- XOR ka use bit manipulation tricks me common hai.
- Left shift/Right shift operations fast multiplication/division by powers of 2 ke liye use hote hain.
- Negative numbers ke liye complement aur unsigned shift ka result samajhna thoda tricky hota hai (2's complement system).
*/


    }    
}
