class Student {
    public String name;
    public int rollNo;
    public String course;
    public int m1,m2,m3;

    public int total(){
        return m1+m2+m3;
    }
    public float average(){
        return (float)total()/3;
    }
    public char grade(){
        if(average()>=60){
            return 'A';
        }
        else {
            return 'B';
        }
    }
    public String Details(){ 
        return "\nName = "+name+"\n"+"Roll No = "+rollNo+"\n"+"Course = "+course+"\n";
        // if you replace the method name with toString then you can 
        // call this method only using refrence variable name -> s ,no need to do this -> s.toString 
    }
}

public class ClassObjectExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Raman";
        s.rollNo = 44;
        s.course = "MCA";
        s.m1 = 90;
        s.m2 = 80;
        s.m3 = 70;

        System.out.println("TotalMarks = "+ s.total());
        System.out.println("Average = "+ s.average());
        System.out.println("Grade = "+ s.grade());
        System.out.println("<-- Student Details --> "+ s.Details());
        // System.out.println("<-- Student Details --> "+ s);

    }
}
