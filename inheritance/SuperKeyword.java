class Parent{
    int x=10;

    void display(){
        System.out.println("Parent Display");
    }
}

class Child extends Parent{
    int x = 20;

    void show(){
        System.out.println(x);
        System.out.println(super.x);
    }
    void display(){
        System.out.println("Child Display");
    }

    void ParentDisplay(){
        super.display();
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        c.display();
        c.ParentDisplay();
    }
}

// super keyword is a reference to a super class
// by using super inside sub class constructor we can call the constructor of super class
