package pkg10.bolum;

public class MyPoint {
    private double x;
    private double y;
    
    
    public MyPoint() {
        this(0, 0);
    }
    
    
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
   
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    
    public double distance(MyPoint secondPoint) {
        return distance(secondPoint.getX(), secondPoint.getY());
    }
    
    
    public double distance(double x2, double y2) {
        return Math.sqrt(Math.pow(this.x - x2, 2) + Math.pow(this.y - y2, 2));
    }
    
    
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(10, 30.5);
        
        System.out.println("Nokta 1 koordinatları: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Nokta 2 koordinatları: (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("İki nokta arasındaki mesafe: " + p1.distance(p2));
    }
}
