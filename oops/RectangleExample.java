class Rectangle {
    public double length;
    public double breadth;

    public double area() {
        return length * breadth;
    }

    public double parameter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        return length == breadth;
    }
}

class RectangleExample {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 10;

        System.out.println("Area = " + r.area());
        System.out.println("Parameter = " + r.parameter());
        System.out.println("Is it a Square? -> " + r.isSquare());

    }
}