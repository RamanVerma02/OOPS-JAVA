// ALL ABOUT FINAL MEMBER --> Final defines Constant Value
public class FinalMember {
    final float PI= 3.1425f;
    // PI = 3.1425f;  Not alowed

    /*
    Inside instance Block 
    {
        PI = 3.1425f;
    }
    */

    /* we can initialize final member inside constructor or in static block 
    public Final(){
        PI = 3.1425f;
    }
    */

    public static void main(String[] args) {

        // System.out.println(PI);
    }
}

/*   << Final Members or Identifiers >>
1) we can not use Non static member inside static method(need to make member static first)
2) we can not initilize final member in class in next line.
eg : -  final float PI;
         PI = 3.1425f;      (X) 
        final float PI = 3.1425f;      (right)

3) Inside instance block (2nd way to initialize)
    If you use a block then it is allowed
    {               --> it is instance block 
         PI = 3.1425f;
    }

3(ii) final float PI;
    Static  --> if you make static block then not allowed 
    {                
         PI = 3.1425f;
    }
    --> to make it allowed you need to make final variable static 

4) Inside Constructor (3rd way to initialize)
    final float PI;
    public Final(){
        PI = 3.1425f;
    }

*/