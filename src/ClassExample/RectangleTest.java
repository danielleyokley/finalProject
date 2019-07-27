package ClassExample;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rec = new Rectangle(5, 6);
		System.out.println(rec.getArea());
		System.out.println(rec.getPerimeter());
		
		rec.setLength(20);
		System.out.println(rec.getArea());
		System.out.println(rec.getPerimeter());
	}

}
