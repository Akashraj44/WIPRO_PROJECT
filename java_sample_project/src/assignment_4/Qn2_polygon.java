package assignment_4;

//Interface
interface Polygon {

 // Abstract method
 double getArea();

 // Default method (sum of sides)
 default double getPerimeter(int... sides) {
     int sum = 0;
     for (int s : sides) {
         sum += s;
     }
     return sum;
 }

 // Static method
 static String shapeInfo() {
     return "Polygons are 2D shapes with multiple sides.";
 }
}

class Rectangle implements Polygon {
 int length, width;

 
 Rectangle(int length, int width) {
     this.length = length;
     this.width = width;
 }

 public double getArea() {
     return length * width;
 }
}


class Triangle implements Polygon {
 int base, height;

 // Constructor
 Triangle(int base, int height) {
     this.base = base;
     this.height = height;
 }

 public double getArea() {
     return 0.5 * base * height;
 }
}


public class Qn2_polygon {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(10, 5);
        System.out.println("Rectangle Area: " + r.getArea());
        System.out.println("Rectangle Perimeter: " + r.getPerimeter(10, 5, 10, 5));

     
        Triangle t = new Triangle(6, 4);
        System.out.println("\nTriangle Area: " + t.getArea());
        System.out.println("Triangle Perimeter: " + t.getPerimeter(3, 4, 5));

       
        System.out.println("\nInfo: " + Polygon.shapeInfo());

	}

}
