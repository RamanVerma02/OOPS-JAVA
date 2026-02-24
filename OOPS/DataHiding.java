class Rectangle
{
//Properties
	private double length;
	private double breadth;
	
	// ** Getter and Setter are property methods **
	
//Getter  --> allow us to read the property
	public double getLength(){
		return length;
	}

	public double getBreadth(){
		return breadth;
	}

//Setter --> allow us to write the property
	public void setLength(double l){
		// For Validation
		if(l>=0){
			length = l;
		}else{
			length = 0;
		}
	}

	public void setBreadth(double b){
		// can apply same validation here also
		breadth = b;
	}

// Methods
	public double area()
	{
		// return length*breadth; // direct using properties 
		return getLength()*getBreadth();   // use this way too (by getters)
	}

	public double perimeter()
	{	
		return 2*(length+breadth);
	}
	
	public boolean isSquare()
	{
		return length == breadth;
	}
}

public class DataHiding {   // Rec
	public static void main(String[] args)
	{
		Rectangle rg = new Rectangle();
		// rg.length = 24.2;     // this is when we have public properties
		// rg.breadth = 32.3;
		
		rg.setLength(-10.5);
		rg.setBreadth(5.1);

		System.out.println("Area "+rg.area());
		System.out.println("Perimeter "+rg.perimeter());
		System.out.println("Is it a square "+rg.isSquare());

		// by calling getLength method
		System.out.println("length is: "+rg.getLength());
		System.out.println("breadth is: "+rg.getBreadth());

	}
}


/*
	** Types of properties **

	1. Read & writable
--> when both the methods avalible (getLength and setLength) then the property becomes
read writeable 

	2. Read only 
--> just allowed to read , only get method will be there  
    set method is not allowed, you can not modify it

--> situation where we require Read only properties 
eg--> student roll no ,  bank account number

class student
{
	private int rollno;

	public int getRollno(){
		return rollno; 	
	}
}

	3. Write Only    (rarely used mostly in betwee two classes/Threads/programs)
--> just allowed to write , only set method will be there  
get method is not allowed, you can not read it

eg --> producer(set) - consumer(get)   --> will see in multithreading
money doner - he can only modify the balance but can't read it

class CharityAcc 
{
	private double balance;

	public double setBalance(double b){
		balance += b;
	}
}

*/