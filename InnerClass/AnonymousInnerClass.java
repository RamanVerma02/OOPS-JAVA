abstract class My{
    abstract void display();
}

class Outer{
    public void meth(){
        My m = new My() {
            public void display(){
                System.out.println("Overridded method ");
            }
        };
        m.display();
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        
    }
}

/*
A anonymous inner class can be defined at the time of creation of object itself
you can define a class as well as create a object 

usually these are helpful for interfaces and abstract classes 

we can override the abstract methods of abstract classes, as well as, we can 
implement interfaces using anonymous inner classes 

what is the use?
if you have to implement an interface and its usage is limited,
you dont have to write a separate calss and then create its object,
then and there in the same place you can implement the interface as a ananymous class.
and thats the most common thing in java coz java provides lot of built in interfaces and classes
we have to implement the interfaces , we can go for the anonymous inner classes

*/