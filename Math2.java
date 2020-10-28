package sample;
public class Math2 {
	public int div(int a,int b) {
		int div=a/b;
		return div;
	}
	public static void main(String[] args) {
		System.out.println("These are my claculations");
		Math2 m=new Math2();
		int a=6;
		int b=2;
		int div=m.div(a,b);
		System.out.println("Division of two numbers is=" +div);
	}		
}
