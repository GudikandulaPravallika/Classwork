package P1;

public class Protection {
int n=1;
private int n_pri=2;
public int n_pub=3;
protected int n_pro=4;
public Protection()
{
	System.out.println("base constructor");
	System.out.println("n_pri"+n_pri);
	System.out.println("n_public"+n_pub);
	System.out.println("n"+n);
	System.out.println("n_pro"+n_pro);
	
}

}
