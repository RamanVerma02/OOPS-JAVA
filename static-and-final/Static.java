class Test {
    static int x = 10;  // Static member
    int y = 20;         // Non static member

    void show() {
        System.out.println(x + " " + y);
    }

    // Static Method
    static void display() {
        System.out.println(x);
        // non-static variable y cannot be referenced from a static context
        // System.out.println(y);
    }
}

public class Static {
    public static void main(String[] args) {
        Test t = new Test();
        t.x = 20;
        t.y = 30;
        t.show();

        Test t1 = new Test();
        t1.show();

        // Test.display();
    }
}
/*
 * Non-static method can use static method
 * static method can not use non-static method
 * 
 * 
 */