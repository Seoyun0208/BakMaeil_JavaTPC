
public class TPC09 {

	public static void main(String[] args) {
		int a=56;
		int b=44;
		// a+b=?
		TPC09 tpc=new TPC09(); // heap Area
		int sum=tpc.sum(a, b);
		System.out.println(sum);

	}
	public int sum(int a, int b) {
		int sum=a+b;
		return sum;
	}

}
