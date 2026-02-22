public class MethodOverloading {
    static boolean validate(String name){
        return name.matches("[a-zA-Z\\s]+");
    }

    static boolean validate(int age){
        return age>=18 && age <=25;
    }
    public static void main(String[] args) {
        String name = "Raman Verma";
        int age = 23;

        System.out.println(validate(name));
        System.out.println(validate(age));
    }
}
