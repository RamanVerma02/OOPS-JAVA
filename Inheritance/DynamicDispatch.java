class Super{
    void meth1(){
        System.out.println("Super meth1");
    }
    void meth2(){
        System.out.println("Super meth2");
    }
}

class Sub extends Super{
    void meth2(){
        System.out.println("Sub meth2");
    }
    void meth3(){
        System.out.println("Sub meth3");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Super su = new Sub();
        su.meth1();
        su.meth2();
        // su.meth3();  It will not be called coz reference is of super class & it has only two method 

        // Sub se = new Super();   It is not allowed --> sub class ref cant hold obj of Super class

/*      Super s = new Super();
        s.meth1();
        s.meth2();

        Sub sb = new Sub();
        sb.meth1();
        sb.meth2();
        sb.meth3();
*/
    }
    
}
