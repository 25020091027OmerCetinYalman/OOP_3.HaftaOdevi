
package pkg10.bolum;

public class Bolum10_11 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("c1 Alani: " + c1.getArea());
        System.out.println("c1 Cevresi: " + c1.getPerimeter());
        
        System.out.println("Nokta (3, 3) cemberin icinde mi? " + c1.contains(3, 3));
        System.out.println("Yeni cember bu cemberin icinde mi? " + c1.contains(new Circle2D(4, 5, 10.5)));
    }
}

class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getRadius() { return radius; }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        double distance = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return distance < radius;
    }

    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(this.x - circle.getX(), 2) + Math.pow(this.y - circle.getY(), 2));
        return distance + circle.getRadius() <= this.radius;
    }
}
