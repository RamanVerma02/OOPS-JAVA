class Outer{
    static int x=10;  //1) Global variable for inner class 
    Inner in = new Inner();   // Inner Obj in outer class 

    class Inner{
        int y = 20;

        void innerDisplay(){
            System.out.println(x+" inner");
            System.out.println(y+" inner");
        }
    }

    void outerDisplay(){
        Inner i = new Inner();  // Inner Obj in method of outer class
        i.innerDisplay();
        System.out.println(i.y+" outer");
    }
}

public class NestedInnerClass {
    public static void main(String[] args) {
        Outer o =new Outer();
        o.outerDisplay();

        //4) if you want to acces inner class directly then
        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();
        System.out.println(oi.y);
    }
}
/*
2)Inner class can access the member of outer class 

3)How to use inner class?
we can use inner class by creating their object inside outer class
Directly we cant use the member of inner class but by object only  

5)in java , for every class there is a separate class file created (.class file)
for outer class --> Outer.clas
for inner class --> Outer$Inner.class   (className_member)

6) if you create the object of inner class in outer class then you can access it 
in all class but if you create obj inside method of outer class then only inside 
method can use it

7) inner class can access the static member of outer class
*/