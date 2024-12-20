package calcpkg;



public class MyCalc {
	
	public int sum(int a,int b) {
		int c;
		int d;
		c=10+5;
		return c;
		//return a+b;
	}
	public int diff(int a,int b) {
		return a-b;
	}
	
	
	public int Mult(int a,int b) {
		return a*b;
	}
	
	public int Div(int a,int b) {
		return a/b;
	}
	public int Exponential(int variable, int exponent){
		
		int num=variable;
		for(int i=0; i<exponent;i++) {
			num*=num;
		}
		return num;
	}
	
//	public int Addsubtract(int a, int b) {
//		int num=a;
//		num+=5;
//		num-=b;
//		num*=8;
//		return num;
//		
//	}
	public void greeting() {
		System.out.println("Hello Jenkins");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalc pb = new MyCalc();
		System.out.println("Sum is:"+pb.sum(20,10));
		System.out.println("Diff is:"+pb.diff(20,10));
		System.out.println("Mult is:"+pb.Mult(20,10));
		System.out.println("Div is:"+pb.Div(20,10));
		System.out.println("Exponent is: "+pb.Exponential(20, 10));
		pb.greeting();
	}

}
