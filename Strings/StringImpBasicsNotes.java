public class StringImpBasicsNotes {
    public static void main(String[] args) {
        DisplayString ds1 = new DisplayString();
		ds1.display();
    }
}

// String is an immutable object in Java
// Actually complete truth:
// String is a class, and every string literal is an object of String class

// Difference between String, StringBuilder, and StringBuffer

// String 		 → Immutable, thread-safe
// StringBuilder → Mutable, NOT thread-safe, fastest
// StringBuffer  → Mutable, thread-safe, slower

class DisplayString {
		String name = "KIET MCA SEC C ";						// String Literal
		String course = new String("MCA Program");	// new String() Keyword
		String name2 = "KIET MCA";
		void display() {
			System.out.println(name);
			System.out.println(name.toLowerCase());
			System.out.println(course);
			System.out.println(course.toUpperCase());
			System.out.println(course.substring(0,4));
			System.out.println(name.concat(course));
			System.out.println(name2.equals(name));
	 }
}
/*
-------------------------------------------------------------------------

1️⃣ String Literal    Kya hota hai?

- Ye String Constant Pool (SCP) me store hoti hai
- Agar same value pehle se pool me hai, naya object nahi banega
Example ->
String a = "Java";
String b = "Java";		➡️ a aur b same object ko point karenge

🔹 Fayda
✅ Memory efficient
✅ Fast
✅ Most recommended
-------------------------------------------------------------------------

2️⃣ new String() Keyword	Kya hota hai?

- Ye heap memory me hamesha naya object banata hai
- Chahe same content pehle se ho

Example ->
String a = "Java";
String b = new String("Java");

➡️ Content same
➡️ Object alag-alag

🔹 Nuksaan
❌ Extra memory use
❌ Generally avoid kiya jata hai

🔹 Kab use hota hai?
- Jab forcefully new object chahiye
- Rare cases
-------------------------------------------------------------------------

🔹 == kya check karta hai?
    Reference (memory location) same hai ya nahi

🔹 equals() kya check karta hai?
    Actual content (value) same hai ya nahi

🔥 Example 1: String Literal

String a = "Hello";
String b = "Hello";

System.out.println(a == b);        // true
System.out.println(a.equals(b));  // true

Kyun?
 - Dono String Constant Pool me same object ko point kar rahe hain
 - Reference same → == true
 - Content same → equals() true
--------------------------------------------------------------------------

🔥 Example 2: new String() (MOST IMPORTANT)

String a = new String("Hello");
String b = new String("Hello");

System.out.println(a == b);        // false
System.out.println(a.equals(b));  // true

Kyun?
 - new keyword → hamesha naya object
 - Reference alag → == false
 - Content same → equals() true
--------------------------------------------------------------------------

🔥 Example 3: Mixed Case (INTERVIEW FAVORITE)

String a = "Hello";
String b = new String("Hello");

System.out.println(a == b);        // false
System.out.println(a.equals(b));  // true

Kyun?
 - a → String Pool
 - b → Heap (new object)
 - Reference alag, content same


==        → address compare
equals()  → value compare 
--------------------------------------------------------------------------

⚠️ StringBuilder / StringBuffer ke saath TRAP

StringBuilder x = new StringBuilder("Hi");
StringBuilder y = new StringBuilder("Hi");

System.out.println(x == y);        // false
System.out.println(x.equals(y));  // false ❗

Kyun?
- StringBuilder / StringBuffer
  - equals() override nahi karte
  - Isliye equals() bhi reference compare karta hai

👉 Agar content compare karna ho:
x.toString().equals(y.toString());    // true


🔥 Interview PERFECT Answer (2 lines)

== checks reference equality, while equals() checks content equality.
In String, equals() is overridden to compare content, but in StringBuilder/StringBuffer it is not.
*/
