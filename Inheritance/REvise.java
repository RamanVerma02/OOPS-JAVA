class Rectangle{
    // Data Hiding (Encapsulation)
    private int length;
    private int breadth;

    // Defalut Constructor
    public Rectangle(){
        length = breadth = 1;
    }
    // Constructor with One parameter
    public Rectangle(int length){
        this.length = length;
        breadth = 1;
    }
    // Constructor with Two parameter
    public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }

    // Getters (Read Access)
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }

    // Setters (Update Access with Validation)
    public void setLength(int l){
        if(l > 0){
            length = l;
        }
        else{
            length = 1;
        }
    }
    public void setBreadth(int b){
        if(b > 0){
            breadth = b;
        }
        else{
            breadth = 1;
        }
    }
    
    // Methods
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}

public class REvise {
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        Rectangle r1 = new Rectangle(2);
        Rectangle r2 = new Rectangle(2,4);
        r.setLength(1);
        r.setBreadth(5);
        System.out.println("Area "+r.area());
        System.out.println("Area "+r1.area());
        System.out.println("Area "+r2.area());

        // To get the value we use Gettters (Data Access)
        System.out.println("Length: "+r.getLength());
        System.out.println("Breadth: "+r.getBreadth());
    }
}

/*
✅ Constructor vs Setter ka Rule
- Constructor = Object banate time automatic run hota hai
- Setter = Object banne ke baad manually call hota hai

✅ Important Point:
Constructor pehle execute hota hai
Setter baad me execute hota hai
Setter constructor ki value ko change kar deta hai

✅ Rule याद रख:
Object creation → Constructor runs first
After creation → Setter can modify values

✅ Constructor ka real use कब होता है?

- जब object बनते ही जरूरी values देना हो
- Object को हमेशा valid state में रखना हो

Example:
Rectangle r = new Rectangle(10,5);

✅ Setter ka real use कब होता है?

- जब object later modify करना हो
- User input या dynamic values देनी हो

Example:
r.setLength(userInput);


✅ Best Practice (Interview Answer)
💡 Constructors initialize करते हैं
💡 Setters update करते हैं
*/