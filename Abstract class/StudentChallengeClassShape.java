abstract class Shape{
    abstract public double area();
    abstract public double perimeter();
}
class Circle extends Shape{
    public double radius;

    public Circle(int x){
        radius = x;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
class Rectangle extends Shape{
    public int length;
    public int breadth;

    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }

}
public class StudentChallengeClassShape {
    public static void main(String[] args) {
        Shape sh = new Circle(5);
        System.out.println(sh.area());
        System.out.println(sh.perimeter());

        Rectangle r = new Rectangle();
        r.length=5;
        r.breadth=2;
        System.out.println(r.area());

        Shape s = r;
        System.out.println(s.perimeter());
        
    }
}
