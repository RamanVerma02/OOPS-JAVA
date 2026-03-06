class Parent{
    public Parent(){
        System.out.println("Parent non para Constructor");
    }

    public Parent(int x){
        System.out.println("Parent One Parameter");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Child non para Constructor");
    }   
    public Child(int y){
        super(y);
        System.out.println("Child One Parameter");
    }
    public Child(int x, int y){
        super(x);
        System.out.println("Child Two Parameter");
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Child c = new Child(10,15);
    }
}
