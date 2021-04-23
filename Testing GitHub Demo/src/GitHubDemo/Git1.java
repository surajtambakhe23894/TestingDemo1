package GitHubDemo;

public class Git1 {
	public static void main(String[] args) {
		System.out.println("Hello");
		Git1 g1=new Git1();
		g1.add();
		g1.sub();
		GitDemo2 g2=new GitDemo2();
		g2.m1();
	}
	public void add()
	{
		System.out.println("add--- method1");	
	}
	public void sub()
	{
		System.out.println("sub-- method2");	
	}
}
