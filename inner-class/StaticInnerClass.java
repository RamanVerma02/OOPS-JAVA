class Outer {
    static int x = 10; // only static members can be accessed in Static inner class
    int y = 20;

    static class Inner {
        void display() {
            System.out.println(x);
            // System.out.println(y); // cant acceess
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer.Inner();
        oi.display();
    }
}

/*
 * -> Static inner classes are the static member of outer classes and the object
 * of
 * static inner classes can be created ouside the outer class.
 * 
 * -> You can create them Access them anywhere and you dont have to create the
 * object
 * of outer class
 * 
 * -> they can be direclty acces outside the outer class(just by usig the outer
 * class name)
 * unlike nested inner class
 * Outer.Inner oi = new Outer.Inner();
 */
