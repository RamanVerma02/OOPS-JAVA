class Parent{
    public Parent(){
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor");
    }
}

class GrandChild extends Child{
    public GrandChild(){
        System.out.println("GrandChild Constructor");
    }
}

public class ConstInInheritance {
    public static void main(String[] args) {
        GrandChild g = new GrandChild();
    }
}


/*
Constructor in Inhertance 
agar hum sub class ka constructor banate h toh wo phle apni prent class ka 
constructor call/execute karega uske baad apna 

yha par humne sub ki sub class banayi h toh grandchild class ka constructor 
banane par usne phle parent ki parent class ka object execute kiya uske baad 
parent ka or phir apna 

is trha se constructor kaam karta h inheritance me 
*/