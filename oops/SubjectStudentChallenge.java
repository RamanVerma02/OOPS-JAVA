class Subject {
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public Subject(String subId, String name) {
        this.subId = subId;
        this.name = name;
    }

    public Subject(String subId, String name, int marksObtain) {
        this.subId = subId;
        this.name = name;
        this.marksObtain = marksObtain;
    }

    public String getSubId() {
        return subId;
    }

    public String getName() {
        return name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    public void setMaxMarks(int mm) {
        maxMarks = mm;
    }

    public void setMarksObtain(int m) {
        marksObtain = m;
    }

    public boolean isQualified() {
        return marksObtain >= maxMarks / 10 * 4;
    }

    public String toString() {
        return "\nSubject ID: " + subId + "\nName: " + name + "\nMarks Obtained: " + marksObtain;
    }
}

class Student{
    private int rollNo;
    private String name;
    private String dept;
    private int numOfSub;
    private Subject sub[];

    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public Student(int rollNo, String name, int ns){
        this.rollNo = rollNo;
        this.name = name;
        this.numOfSub=ns;
    }

    public int getRollNo(){return rollNo;}
    public String getName(){return name;}
    public String getDept(){return dept;}
    public int getNoOfSubjects(){return numOfSub;}
    public Subject[] getSubjects(){return sub;}

    public void setDept(String dept)
    {
        this.dept=dept;
    }
    public void setSubjects(Subject ...subs)
    {
        for(int i=0;i<subs.length;i++)
            sub[i]=subs[i];
    }
    
    public String toString()
    {
        return "Roll :" +rollNo+"\nName :"+name+"\nDept :"+dept;
    }
}

public class SubjectStudentChallenge {
    public static void main(String[] args) {
        Subject subs[] = new Subject[3];
        subs[0] = new Subject("s101", "DSA", 100);
        subs[1] = new Subject("s102", "OOPS", 100);
        subs[2] = new Subject("s102", "Project", 100);

        for(Subject s: subs)
            System.out.println(s);
    }
}
