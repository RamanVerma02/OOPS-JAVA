class Rectangle{
    int length;
    int breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
        System.out.println("Length "+this.length);
        System.out.println("breadth "+this.breadth);
    }

    public void display(){
        System.out.println("Length "+this.length);
        System.out.println("breadth "+this.breadth);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 12);
        // r.display();
    }
}

/*
this is used inside the class only 
this is a reference to present/current object 
*/