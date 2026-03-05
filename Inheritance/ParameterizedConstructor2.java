class Rectangle{
    int length;
    int breadth;
// Constructor
    public Rectangle(){
        length = breadth = 1;
    }
    public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
}
class Cuboid extends Rectangle{
    int height;
// Constructor
    Cuboid(){
        height =1;
    }
    Cuboid(int h){
        height = h;
    }
    Cuboid(int l, int b,int h){
        super(l,b);        
        height = h;
    }
//Method
    int volume(){
        return length*breadth*height;
    }
}

public class ParameterizedConstructor2 {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(5,5,5);
        System.out.println(c.volume());
    }
}
