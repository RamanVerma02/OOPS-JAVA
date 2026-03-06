class Test{
    static
    {
        System.out.println("Block 1");
    }
    static 
    {
        System.out.println("Block 2");
    }
}
public class StaticBlock {
    // static
    // {
    //     System.out.println("Block 1");
    // }
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("Main method");
        // Test t = new Test();
    }

    // static 
    // {
    //     System.out.println("Block 2");
    // }
}

/*
<< CASE 1 >>
static method printed even after they are not inside main method

coz once we run the program this class "StaticBlock" will get loaded 
and once the class get loaded it will execute the static blocks, in the same order

<< CASE 2 >> 
what if we create another class and there use static block
- if that class object is not in main class then Only main method executes

Why so?
- coz that class is not loaded
- to load that class make the object inside "main-class" then it will be loaded
- Yeah see now working

What if object is created after printf in main method ?
- it will execute printf first then object static block

*/