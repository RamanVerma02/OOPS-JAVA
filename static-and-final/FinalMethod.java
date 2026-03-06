// About FINAL Method  --> Final restrict Overriding
class Test{
    public final void show()
    {
        System.out.println("HEllo");
    }
}
class Quiz extends Test{
    // Cannot override the final method from Test
    // So we can restrict Polymorphism , runtime polymorphism

    @Override
    public void show()
    {
        System.out.println("No test today");
    }
}

// About FINAL Class  --> Final restrict inhertance
final class Parent {
    public void show(){
        System.out.println("Papa");
    }
}
// The type Child cannot inherit the "final" class Parent
class Child extends Parent {
    public void show(){
        System.out.println("Beta");
    }
}

public class FinalMethod {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
