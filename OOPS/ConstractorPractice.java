class Cylinder {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int r) {
        if (r >= 0) {
            radius = r;
        } else {
            radius = 0;
        }
    }

    public void setHeight(int h) {
        if (h >= 0) {
            height = h;
        } else {
            height = 0;
        }
    }

    Cylinder(){
        radius = height = 1;
    }

    Cylinder(int r){
        radius = r;
        height = 1;
    }

    Cylinder(int r , int h){
        radius = r;
        height = h;
    }

    public double lidArea(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double drumArea()
    {
        return 2*lidArea()+perimeter()*height;
    }
    public double volume()
    {
        return lidArea()*height;
    }

}

public class ConstractorPractice {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.setRadius(5);
        cy.setHeight(2);

        System.out.println("Area "+cy.lidArea());
        System.out.println("Volume "+cy.volume());

        System.out.println("Circumference "+cy.perimeter());
        System.out.println("totalSurfaceArea "+cy.drumArea());
        
        System.out.println("Radius "+cy.getRadius());
        System.out.println("Height "+cy.getHeight());
    }
}
