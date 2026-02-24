class Outer {

    void outerDisplay() {

        class Inner {

            void innerDisplay() {
                System.out.println("Hello");
            }
        }

        Inner i = new Inner();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        
    }
}

/*
 * when a inner class is created inside the method of outer class thats called
 * local inner class
 * that class is not visible to outer class --> its local to method
 * 
 * what is the use? why we need class inside the method
 * - Usually it is useful when you want to write a class that is inheriting 
 * from some existing class or you want to write a class wihch is implementing an
 * interface and THAT class is usefull only inside that method, not outside that 
 * method , then we can define a local inner class
 * 
 * 
 * 
 */