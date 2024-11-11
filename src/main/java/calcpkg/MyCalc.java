package calcpkg;



public class MyCalc {
	
	public int sum(int a,int b) {
		return a+b;
	}
	public int diff(int a,int b) {
		return a-b;
	}
	
	
	public int Mult(int a,int b) {
		return a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalc pb = new MyCalc();
		System.out.println("Sum is:"+pb.sum(20,10));
		System.out.println("Diff is:"+pb.diff(20,10));
		System.out.println("Mult is:"+pb.Mult(20,10));
	}

}
