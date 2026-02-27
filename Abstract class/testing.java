abstract class Parent{
    public void meth1(){
        System.out.println("parent meth");
    }

    abstract public void meth2();
}
class Child extends Parent{
    public void meth2(){
        System.out.println("Child meth");
    }
    public void meth3(){
        System.out.println("hehe");
    }
}

public class testing {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.meth1();
        p.meth2();
        
    }
    
}