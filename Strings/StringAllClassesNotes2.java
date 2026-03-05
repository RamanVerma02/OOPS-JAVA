public class StringAllClassesNotes2 {

	public static void main(String[] args) {
		Display ds1 = new Display();
		ds1.checkImmutable();
	}

}

class Display {
	//String vs StringBuffer vs StringBuilder = ?
	
	void checkImmutable() {
		String fname = "Ravi";
		fname = "Raman";
		// fname = fname + " kumar";
		String lname =  "Sharma";
		String name = fname+lname;
		System.out.println(fname.hashCode());
		System.out.println(lname.hashCode());
		System.out.println(name.hashCode());
		
		System.out.println(fname);   // Ravi kumar
		System.out.println(lname);	// Sharma
		System.out.println(name);	// Ravi kumarSharma
	}
}

// by the law of inheritclass all the member of superclass is the member of subclass

/*------------------------------------------------------
--🔹 String Immutability ka real proof --

String a = "Hello";				a ───▶ "Hello"
String b = a;					a ───▶ "Hello" ◀─── b

a = a + " World";				a ───▶ "Hello World"  naya String object bana ✅ || a ka reference shift ho gaya
								b ───▶ "Hello"		  								b ka reference bilkul nahi badla


System.out.println(a); // Hello World
System.out.println(b); // Hello

--------------------------------------------------------
--🔹 StringBuilder (Mutable) – SAME EXAMPLE --
void checkMutable() {
    StringBuilder a = new StringBuilder("Hello");		a ───▶ "Hello"
    StringBuilder b = a;								a ───▶ "Hello" ◀─── b

    a.append(" World");		--> Yahan naya object nahi banta,Same object modify hota hai,Content directly change ho jaata hai
								a ───▶ "Hello World" ◀─── b
    System.out.println(a); // Hello World
    System.out.println(b); // Hello World
}
👉 Dono change ho gaye
👉 Proof: StringBuilder mutable hai

--------------------------------------------------------
🧠 Interview-ready one-liner

- StringBuilder mutable hota hai, isliye same object me change hota hai aur saare references ko effect padta hai.
String immutable hoti hai, isliye change par naya object banta hai.

--------------------------------------------------------
🔹 StringBuffer kya hota hai?

StringBuffer ek mutable class hai jo thread-safe hoti hai.

Simple words me:
- Mutable → content change ho sakta hai
- Thread-safe → multiple threads ek saath use karein to bhi safe
- StringBuilder jaisa, bas slow hota hai (extra safety ki wajah se)

void checkStringBuffer() {
    StringBuffer a = new StringBuffer("Hello");
    StringBuffer b = a;

    a.append(" World");

    System.out.println(a);
    System.out.println(b);
}

SAME AS StringBuilder same ek dum sab 

-----------------------------------------------------------------------------------------
| Feature              | String      | StringBuilder                | StringBuffer      |
| -------------------- |-------------| -----------------------------| ------------------|
| Mutable              | ❌ No      | ✅ Yes                      | ✅ Yes             |
| Thread-safe          | ✅ Yes     | ❌ No                       | ✅ Yes             |
| Performance          | Slow        | Fastest                     | Slow (sync)        |
| New object on change | ✅ Yes     | ❌ No                       | ❌ No              |
| Use case             | Fixed text  | Single-thread, heavy edits  | Multi-thread safety |
------------------------------------------------------------------------------------------
-------------------------------------------------------------------------
🔹 Thread-safe ka matlab kya hota hai?

Thread-safe ka matlab:
Jab multiple threads ek hi object ko same time access / modify karein,
tab bhi data corrupt na ho, output unpredictable na bane.
--------------------------------------------------------------------------
🔹 Thread kya hota hai? (1 line recap)

Thread = program ka ek flow of execution
Java me ek hi program me:
- Thread-1
- Thread-2
ek saath chal sakte hain (parallel)
-------------------------------------------------------------------------

🔥 Problem samjho (Thread-unsafe case)
Socho 2 log ek hi notebook me same time likh rahe hain ✍️✍️
→ likha hua bigad sakta hai ❌

Programming me bhi same hota hai.

-------------------------------------------------------------------------
<-- StringBuilder — NOT thread-safe -->

StringBuilder sb = new StringBuilder("Hi");
Agar:
Thread-1 → sb.append(" A")
Thread-2 → sb.append(" B")

Same time chale to output ho sakta hai:

Hi AB
Hi BA
Hi A
Hi B

-------------------------------------------------------------------------

🔥 Interview PERFECT answer (2 lines)

Thread-safe means an object can be safely accessed by multiple threads simultaneously without data inconsistency.
StringBuffer is thread-safe due to synchronized methods, StringBuilder is not, and String is thread-safe because it is immutable.






*/
