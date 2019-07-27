package ClassExample;

public class Rectangle {
	
	private double length;
	private double width;
	private double area;
	
	private double perimeter;
	
	public Rectangle(double length, double width) {
		this.setLength(length);
		this.setWidth(width);	
		calculateChanges();
	}
	public void calculateChanges() {
		area = length * width;
		perimeter = 2 * length + 2 * width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
		calculateChanges();
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
		calculateChanges();
	}
	public double getArea() {
		return area;
	}
	public double getPerimeter() {
		return perimeter;
	}
}
