interface Test{
    void show1();
    void show2();
}

class My implements Test{
    public void show1(){
        System.out.println("show1 of class My");
    }
    public void show2(){
        System.out.println("show2 of class My");
    }
    public void show3(){
        System.out.println("show3 of class My");
    }
}

public class Interface {
    public static void main(String[] args) {
        Test t = new My();
        t.show1();
        t.show2();
    }
    
}
/*
Purpose of Abstract Class is to acheive polymorphism as well as inherit
Interface is completly used for Polymorphism (it doest borrow)

Classes --> extends
Interface -> implements

"Interface is abstract class with all abtract methods."
so purpose of interface is to acheive polymorphism.

extends --> a class can extended from only one class
implements --> it can implements multiple interface

*/