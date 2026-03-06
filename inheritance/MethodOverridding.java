class Super{
    void display(){
        System.out.println("Super Class Display");
    }
}
class Sub extends Super{
    @Override
    void display(){
        System.out.println("Sub Class Display");
    }
}

public class MethodOverridding {
    public static void main(String[] args) {
        Super sup = new Super();
        sup.display();

        Sub sb = new Sub();
        sb.display();

        Super s = new Sub();
        s.display();  // it will call the object method not the reference method known as Dynamic Method Dispatch
    }
}


// because i am calling version of disaply() which is not taking any argument
// if i add argument in sub class method to call the super class non para method 