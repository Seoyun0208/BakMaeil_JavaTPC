
public class TPC07 {

	public static void main(String[] args) {
		
		int a=20;
		float b=56.7f;
		// a+b=?
		float sum=sum(a,b); // Call By Value
		System.out.println(sum);
		
		int[] arr={1,2,3,4,5};
		// 배열의 총합=?
		int arrSum=arrSum(arr); // Call By Reference
		System.out.println(arrSum);
	}
	public static int arrSum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static float sum(int a, float b) {
		float sum=a+b;
		return sum;
	}

}
