
public class TestJar {
	
	public int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestJar TJ=new TestJar();
		int a=TJ.mul(12, 4);
		System.out.println(a);
	}

}
