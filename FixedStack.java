
public class FixedStack implements IntStack {
	private int stck[];
	private int tos;
	FixedStack(int size)
	{
            System.out.println("Intefaces implementation")
		int stck[]=new int[size];
		tos=-1;
	}
	public void push(int item)
	{
		if(tos==stck.length-1)
			System.out.println("Stack is full");
		else
			stck[++tos]=item;
	}
	public int pop()
	{
		if(tos<0) {
		System.out.println("Stack is empty");
		return 0;
		}
		else
			return stck[tos--];
	}
	

}
