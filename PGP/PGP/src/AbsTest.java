abstract class Shape {
	String color;

	public Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	abstract public void area();
}

class Rectangle extends Shape {
	int length, breadth;

	public Rectangle(String color, int len, int bre) {
		super(color);
		this.length = len;
		this.breadth = bre;
	}

	@Override
	public void area() {
		System.out.println("Area of Rectangle = " + (this.length * this.breadth));
	}
}

class Circle extends Shape {
	int radius;

	public Circle(String color, int r) {
		super(color);
		this.radius = r;
	}

	@Override
	public void area() {
		System.out.println("Area of Circle = " + (Math.PI*this.radius*this.radius));
	}
}

public class AbsTest {
	public static void main(String[] args) {
		Shape s = null;
		//s = new Shape("red"); //CE
		
		s=new Rectangle("Red",5,4);
		System.out.println("Color = "+ s.getColor());
		s.setColor("Yellow");
		System.out.println("Color = "+ s.getColor());
		s.area(); //calls area() of Rectangle
		
		System.out.println();
		s=new Circle("Blue",4);
		s.area(); //calls area() of Circle
	}
}
