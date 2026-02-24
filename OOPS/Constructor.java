class Rectangle {
    private int length;
    private int breadth;

    // non-parameterized constructor
    public Rectangle() {
        length = 1;
        breadth = 1;
    }

    // parameterized constructor
    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    // another way of writing a constructor
    public Rectangle(int s){
        length=breadth=s;
    }

    public int area(){
        return length*breadth;
    }
    public int parameter(){
        return 2*(length+breadth);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle();    // it will call non-parameterized constructor
        Rectangle rc = new Rectangle(2,3); // it will call Parameterized constructor
        Rectangle rc = new Rectangle(10);

        System.out.println("Area = "+rc.area());
        System.out.println("Parameter = "+rc.parameter());
    }
}


/*
                                        <-- NOTES -->
"Constructor is a method of a class which is automatically called whenever an object is created"
- it will have the same name as the class name.
- it dont have any return type.
- Constructor can be overloaded.
- Every class will have a default constructor.
 Two types of constructor
1) Non parameterized  {Replacement of default constructor}
2) parameterized 

*/