
public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A s=new A();
		B a=new B();
		System.out.println("Contents of a");
		s.i=10;
		s.j=20;
		s.showij();
		System.out.println("contents of b");
		a.i=7;
		a.j=8;
		a.k=9;
		a.showij();
		a.showk();
		System.out.println("sum is ");
		a.sum();

	}

}
