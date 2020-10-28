package sample;
public class Math1 {
	public int mul(int a,int b) {
		int mul=a*b;
		return mul;
	}
	public static void main(String[] args) {
		System.out.println("These are my claculations");
		Math1 m=new Math1();
		int a=6;
		int b=2;
		int mul=m.mul(a,b);
		System.out.println("Multiplication of two numbers is=" +mul);
	}		
}
