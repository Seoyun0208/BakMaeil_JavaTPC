
public class TPC04 {

	public static void main(String[] args) {
		// 데이터를 이동하라. 변수 vs. 배열
		
		int a,b,c;
		a=10;
		b=20;
		c=30;
		
		// a+b+c=? 메서드 처리 => hap();
		hapInt(a,b,c);
		
		int[] arr = new int[3];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		
		hapArr(arr);
	}
	
	public static void hapInt(int x, int y, int z) {
		int sum=x+y+z;
		System.out.println(">> hapInt: " + sum);
	};
	
	public static void hapArr(int[] a) {
		// 반복문 활용 - for, while
		int sum=0;
		for(int i=0;i< a.length;i++) {
			sum +=a[i];
		}
		System.out.println(">> hapArr: " + sum);
	};

}
