package Day_04;

public class Main {
	public Main() {
		this(10);
		
		System.out.println("inside Main()");
	}
	public Main(int x) {
		this(10.5);
		System.out.println("inside Main(int x");
		
	}
	public Main(double d) {
		this("s");
		System.out.println("inside Main(double d)");
	}
	public Main(String s) {
	
		System.out.println("inside Main(String s)");
	}
	public static void main(String[] args) {
		Main a1=new Main();
	}

}
