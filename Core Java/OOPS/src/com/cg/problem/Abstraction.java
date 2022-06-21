package com.cg.problem;

//An abstract class is a class that is declared abstract—it may 
//or may not include abstract methods. Abstract classes cannot be instantiated, 
//but they can be subclassed.


//An abstract method is a method that is declared
//without an implementation (without braces, and followed by a semicolon), like this:


//abstract void moveTo(double deltaX, double deltaY);
//If a class includes abstract methods, then the class
//itself must be declared abstract, as in:


//public abstract class GraphicObject {
 // declare fields
 // declare nonabstract methods
 //abstract void draw();
//}

//Private methods are not polymorphic (you cannot inherit them), 
//so it makes no sense 
//to make a private method abstract. Making a method abstract means
//you'd have to override and implement it in a subclass, 
//but since you can't override private methods, you can't make them abstract either.

//An abstract class can't be final because the final and abstract 
//are opposite terms in JAVA. Reason: An abstract class must be
//inherited by any derived class because a derived class is 
//responsible to provide the implementation of abstract methods
//of an abstract class
