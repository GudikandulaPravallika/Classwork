
public class IFTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedStack mystack1=new FixedStack(5);
		FixedStack mystack2=new FixedStack(8);
		for(int i=0;i<5;i++)
		{
			mystack1.push(i);
		}
		for(int i=0;i<8;i++)
		{
			mystack2.push(i);
		}
		for(int i=0;i<5;i++)
		{
			mystack1.pop();
		}
		for(int i=0;i<8;i++)
		{
			mystack2.pop();
		}



		
		

	}

}
