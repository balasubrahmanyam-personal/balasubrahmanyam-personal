package assignment6;
//rle 1: in any simple class,if you declare a methods,
//that method need to be declared as an "abstract" method.
//rule 2:in any simple class,if you have declared an abstract(), that class
//need to be declared as an "abstract class".
//rule 3:you can declared a class as an "abstract" class,
//and it may or may not have any abstract methods or concrete methods
//rule 4: if any subclass whats to extends this abstract class:
//4.1 : they have to implement all the abstract methods and provide the implementation
//4.1 : if subclass fail to do so,that subclass also need to declared itself as an "abstract class".
//rule 5: you cannot instaniate an absract class.or you cannot create an object
//of an abstract class.
abstract class Shape{
    //abstract method
    public abstract void area();
    //concrete method/normal method
    public void display(){

        System.out.println("This is shape ");
    }
}
class Circle extends Shape{
    public void area(){

        System.out.println("circle class");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.area();

    }
}
