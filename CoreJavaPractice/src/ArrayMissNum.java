
public class ArrayMissNum {

	public static void main(String[] args) {
		int[] arr= {7,5,6,1,4,8,2};
		int len=arr.length+1;
		int sums=len*(len+1)/2;
		int Asum=0;
		for(int i=0;i<arr.length;i++) {
			Asum+=arr[i];
		}
		int MN=sums-Asum;
		System.out.println(MN);
		
	}

}
