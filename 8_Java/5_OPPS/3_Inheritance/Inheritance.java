public class Inheritance {
    public static void main(String [] args){

        /*
========================
INHERITANCE IN JAVA
========================

Inheritance ek OOP concept hai jisme ek class dusri class ki
properties (variables) aur methods ko use kar sakti hai.

Isse:
- Code reuse hota hai
- Code duplication kam hota hai
- Program ka structure better hota hai

Java me inheritance ke liye keyword use hota hai:
extends


========================
1. SINGLE INHERITANCE
========================

Definition:
Single inheritance me ek parent class aur ek child class hoti hai.

Matlab:
Ek class sirf ek hi class se inherit karti hai.

Structure:

Parent
  |
  Child

Example idea:
Animal → Dog

Dog class Animal ke methods aur properties use kar sakti hai.


========================
2. MULTILEVEL INHERITANCE
========================

Definition:
Multilevel inheritance me inheritance multiple levels par hota hai.

Matlab:
Ek class dusri class se inherit karti hai
aur phir teesri class usse inherit karti hai.

Structure:

Grandparent
     |
   Parent
     |
    Child

Example idea:
Animal → Dog → Puppy

Puppy class Dog aur Animal dono ke features use kar sakti hai.


========================
3. HIERARCHICAL INHERITANCE
========================

Definition:
Hierarchical inheritance me ek parent class se
multiple child classes inherit karti hain.

Structure:

        Parent
       /      \
   Child1    Child2

Example idea:
Animal → Dog
Animal → Cat

Dog aur Cat dono Animal ke properties aur methods use kar sakte hain.


========================
4. MULTIPLE INHERITANCE
========================

Definition:
Multiple inheritance me ek class multiple parent classes se
inherit karti hai.

Structure:

Parent1     Parent2
     \       /
       Child

Important:
Java me classes ke through multiple inheritance allowed nahi hai.

Reason:
Diamond problem.


========================
5. MULTIPLE INHERITANCE IN JAVA
========================

Java me multiple inheritance ko achieve karne ke liye
interfaces use kiye jate hain.

Matlab:
Ek class multiple interfaces implement kar sakti hai.


========================
IMPORTANT KEYWORDS
========================

extends
Used for class inheritance.

implements
Used for interface inheritance.

super
Parent class ke constructor ya methods ko call karne ke liye.


========================
SUMMARY
========================

Single        → One parent, one child
Multilevel    → Chain inheritance (A → B → C)
Hierarchical  → One parent, multiple children
Multiple      → Multiple parents (Java me interfaces se)
*/


    }    
}
