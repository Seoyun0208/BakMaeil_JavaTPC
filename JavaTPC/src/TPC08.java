
public class TPC08 {

	public static void main(String[] args) {
		int a=30;
		int b=50;
		int add=add(a,b); // static method call
		System.out.println(add);

	}
	public static int add(int a, int b) {
		int sum=a+b;
		return sum;
	}

}