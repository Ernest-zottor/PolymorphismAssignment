
public class Q1 {

	public static void main(String[] args) {

		Shape s1 = new Rectangle("black", 6, 7);  
		System.out.println(s1);  
		System.out.println("Area of rectangle is " + s1.getArea()+ "\n");  


		Shape s2 = new Triangle("red", 6, 7);  
		System.out.println(s2);  

		System.out.println("Area of of triangle is " + s2.getArea());  


	}

}
        // Shape superclass
class Shape {

	private String color;

	public Shape (String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Shape's color= " + color;
	}

	public double getArea() {
		return 0;
	}
}

     // Rectangle subclass
class Rectangle extends Shape {

	private int length, width;

	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle's parameter: length= " + length + ",width= " + width +
				"," + super.toString() + "]";
	}

	@Override
	public double getArea() {
		return length*width;
	}
}

   // Triangle subclass
class Triangle extends Shape {

	private int base, height;

	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle' parameter: base= " + base + ",height= " + height + "," + super.toString();
	}

	@Override
	public double getArea() {
		return 0.5*base*height;
	}
}
