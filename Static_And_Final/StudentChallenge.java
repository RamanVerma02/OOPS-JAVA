import java.time.Year;

class Student{
    private String rollno;

    private static int count = 1;

    private String assignRollNo()
    {
        int year = Year.now().getValue();
        
        String rno = "Uni-"+year+"-"+count;
        count++;
        
        return rno;
    }
    
    Student(){
        rollno = assignRollNo();
    }
    public String getRollNo(){
        return rollno;
    }
}

public class StudentChallenge {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());
    }
}

/*
        ✅ Best & Modern Way: java.time (Java 8+)
1️⃣ Only Year
int year = java.time.Year.now().getValue();


➡️ Output: 2026

2️⃣ Only Month
int month = java.time.LocalDate.now().getMonthValue();


➡️ Output: 2 (February)

OR month name chahiye:

String month = java.time.LocalDate.now().getMonth().toString();


➡️ FEBRUARY

3️⃣ Only Day
int day = java.time.LocalDate.now().getDayOfMonth();


➡️ 6

4️⃣ Year + Month
java.time.YearMonth ym = java.time.YearMonth.now();

int year = ym.getYear();
int month = ym.getMonthValue();

5️⃣ Full Date (Year-Month-Day)
java.time.LocalDate date = java.time.LocalDate.now();


Example output:

2026-02-06

6️⃣ Time only (HH:MM:SS)
java.time.LocalTime time = java.time.LocalTime.now();

7️⃣ Date + Time
java.time.LocalDateTime dt = java.time.LocalDateTime.now();


*/