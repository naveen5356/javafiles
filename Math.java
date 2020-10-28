package sample;
public class Math {
	public int add(int a,int b,int c) {
		int sum=a+b+c;
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("These are my claculations");
		Math m=new Math();
		int a=6;
		int b=2;
		int c=3;
		int sum=m.add(a,b,c);
		System.out.println("Sum of two numbers is=" +sum);
	}		
}
