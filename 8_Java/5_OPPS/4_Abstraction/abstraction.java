public class abstraction {

    public static void main(String[] args){

        /*
        
        ===============================
ABSTRACTION IN JAVA
===============================

1. What is Abstraction?
-------------------------------

Abstraction means hiding unnecessary internal details 
and showing only the essential features of an object.

Real life example:
When we drive a car we only use
    accelerator
    brake
    steering

We do NOT know the internal engine mechanism.

So,
User sees WHAT a system does
User does NOT see HOW it does it.


Definition:
Abstraction is the process of hiding implementation details 
and exposing only functionality to the user.



--------------------------------
2. Why Abstraction is Needed
--------------------------------

1. Reduce complexity
2. Improve code readability
3. Improve security (internal logic hidden)
4. Make programs easier to maintain
5. Separate interface from implementation


--------------------------------
3. How Java Achieves Abstraction
--------------------------------

Java provides two ways:

1. Abstract Class
2. Interface


--------------------------------
4. Abstract Class
--------------------------------

An abstract class is a class that cannot be instantiated.

Meaning:
You cannot create an object of an abstract class.

It is mainly used to act as a base class for other classes.

Syntax:

abstract class ClassName
{
    abstract methods
}


Important points:

1. Abstract class may contain
   - abstract methods
   - normal methods

2. Abstract method has
   - no body
   - only declaration

3. Child class MUST implement abstract methods.

4. Abstract class can have:
   - variables
   - constructors
   - normal methods
   - static methods


Example structure:

abstract class Animal
{
    abstract void sound();
}



--------------------------------
5. Abstract Method
--------------------------------

An abstract method is a method that has

    no implementation
    only declaration

Syntax:

abstract returnType methodName();


Example:

abstract void sound();


Meaning:
Every animal must have a sound
but each animal's sound is different.

So child classes implement it.


--------------------------------
6. Child Class Implementation
--------------------------------

When a class extends an abstract class:

It MUST implement all abstract methods.

Example structure:

abstract class Animal
{
    abstract void sound();
}

class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog barks");
    }
}



--------------------------------
7. Important Rules of Abstract Class
--------------------------------

Rule 1
Abstract class cannot be instantiated.

Wrong:

Animal a = new Animal();  // Not allowed


Rule 2
If a class contains an abstract method
then the class MUST be declared abstract.

Example:

abstract class Animal
{
    abstract void sound();
}


Rule 3
A subclass must override all abstract methods.

Otherwise the subclass must also be abstract.


Rule 4
Abstract class can contain constructors.


Rule 5
Abstract class can contain both

    abstract methods
    concrete methods



--------------------------------
8. Example Structure of Abstraction
--------------------------------

Step 1
Define abstract class

abstract class Shape
{
    abstract void area();
}

Step 2
Child classes implement area differently

class Circle extends Shape
{
    void area()
    {
        System.out.println("Area of circle");
    }
}

class Rectangle extends Shape
{
    void area()
    {
        System.out.println("Area of rectangle");
    }
}


Idea:
Same method name
Different implementation



--------------------------------
9. Difference Between Abstraction and Encapsulation
--------------------------------

Abstraction
-----------
Focus: Hiding implementation details

Example:
Car driving controls


Encapsulation
-------------
Focus: Hiding data using private variables

Example:
Bank account balance hidden with getters/setters



--------------------------------
10. Abstraction vs Interface
--------------------------------

Abstract Class

1. Can have normal methods
2. Can have constructors
3. Can have instance variables
4. Supports partial abstraction


Interface

1. Methods are abstract by default
2. No constructors
3. Variables are public static final
4. Supports full abstraction



--------------------------------
11. Real Life Analogy
--------------------------------

TV Remote

Remote provides buttons:

    Power
    Volume
    Channel

User presses button
But internal circuit working is hidden.

This is abstraction.



--------------------------------
12. Key Points to Remember
--------------------------------

1. Abstraction hides implementation details.

2. Achieved using
      abstract class
      interface

3. Abstract class cannot be instantiated.

4. Abstract methods have no body.

5. Child classes must implement abstract methods.

6. Abstraction improves code maintainability.



===============================
END OF NOTES
===============================

        */

    }
    
}
