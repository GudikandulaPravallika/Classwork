
public class Abstractarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(10,20);
		Triangle t=new Triangle(25,50);
		Figure figref;
		figref=r;
		System.out.println("Area of rectangle is"+figref.area());
		figref =t;
		System.out.println("Area of triangle is"+figref.area());
		

	}

}
