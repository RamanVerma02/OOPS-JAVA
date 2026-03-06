// ******************* Interfaces Don't and Do's **********************

interface Test
{
    //1) We can have identifiers in interface and by default they are final and
    // static, Write in upper cases, so we can identify its interface identifier
    final static int X=10;

    //2) By Default Interfaces methods are public and abstract 
    // (even if you dont write) , we cant make them private */
    public abstract void meth1();
    public abstract void meth2();

    //3) Interface dont have method with body BUT
    // Interface can have static method also with the body
    // difference is they can be called without obj
    public static void meth3(){
        System.out.println("meth3 of Test");
    }
    //4) default method can also be used in interface
    // -So it is for if you want to update or modifying existing interfaces without disturbuing 
    //  existing classes we can make use of Default methods
    // (that class will not become abstract class coz you added new method)
    // -Existing classes will get the default method so they are error free
    //  And in new classes you can override the default method
    default void meth5(){
        System.out.println("default method");
    }

    //7) - From Java 9 --> you can write private method
    // private method is not abstract 
    // Use of this method ? --> will be used internally inside the interface 
    // who will use ? --> default method will use it
    private void meth6(){
        System.out.println("private method");
    }
}

//6) interface can extends from another interface
interface Test2 extends Test{
    void meth4();
}

class My implements Test2{
    public void meth1(){}
    public void meth2(){}
    public void meth3(){System.out.println("Holy Fuck");}
    public void meth4(){}
//  it is written after making default class
    public void meth5(){}
}

public class InterfacePractice {
    public static void main(String[] args) {
        //4) because it is static i can acces it using interface name and dot operator
        System.out.println(Test.X);
        //5) we can directly acces static members with interface name and dot operator
        // we dont have to create object to access (we cant create obj of interface)
        // Way 1 of calling static method by interface
        Test.meth3();

        My m = new My();
        m.meth5();
        // 2nd way of calling static method using object of class
        m.meth3();

    }
    
}
