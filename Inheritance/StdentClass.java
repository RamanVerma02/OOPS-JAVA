class Student {
    private int rollNo;
    private String name;
    private int age;

    public Student(){
        rollNo = 1;
        name = "Unknown";
        age = 18;
    }
    public Student(int r, String n, int a){
        rollNo = r;
        name = n;

        // Validation
        if(age > 0){
            age = a;
        }
        else {
            age = 18;
        }
    }
    // Getter (Read access)
    public int getRollNo(){return rollNo;}
    public String getName(){return name;}
    public int getAge(){return age;}

    //Setters (Update acces with Validation)
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        if(a > 0){
            age = a;
        }
        else{
            age = 18;
        }
    }

    //  Method to display student Info
    public void display(){
        System.out.println("RollNo: "+rollNo);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("----------------------");
    }

}

public class StdentClass {
    public static void main(String[] args) {
        // Object 1: Default Constructor
        Student s = new Student();
        s.display();

        // Object 2: Parameterized Constructor
        Student s1 = new Student(2, "Aman Verma",28);
        s1.display();

        // Object 3: Constructor + Setter (Update Later)
        Student s2 = new Student(3,"raman",23);
        
        // Setter used to modify values after creation
        s2.setName("Raman Verma");
        s2.setAge(24);

        s2.display();

    }
}

/*
✅ Raman Interview Line (Strong Answer)

"Constructor initializes object in starting state,
Setter allows controlled modification later.
Together they provide flexibility and encapsulation."

*/