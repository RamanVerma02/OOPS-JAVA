package Recursion.RecursionTree;

public class One {
    public static void fn(int n) {
        if (n > 0) {
            System.out.print(n+" ");
            fn(n - 1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        fn(5);

    }
}
// OUTPUT : 5 4 3 2 1 1 2 3 4 5 

/*  Way To Run Code
Java CORE> javac Recursion/RecursionTree/One.java
Java CORE> java Recursion.RecursionTree.One  

🧠 GOLDEN RULE (isko likh lo copy me 🔥)
Compile  → folder/file   ( / )
Run      → package.class ( . )
*/