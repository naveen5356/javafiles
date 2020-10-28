package sample;
public class ClassA {
	private String name="naveen";
	private int var1=22;
	public String method1() {
		System.out.println("The students are:");
		return name;
	}
	public static void main(String[] args) {
		System.out.println("This is JAVA class");
		ClassA aref=new ClassA();
		//aref.method1();
		String var12=aref.name;
		System.out.println("Name=" +var12);
		int var21=aref.var1;
		System.out.println("Age=" +var21);
		ClassB bref=new ClassB();
		String var13=bref.var2;
		System.out.println("Name=" +var13);
		int var31=bref.var3;
		System.out.println("Age=" +var31);
	}

}
