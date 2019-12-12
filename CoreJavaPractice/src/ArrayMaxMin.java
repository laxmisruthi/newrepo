import java.util.Arrays;

public class ArrayMaxMin {

	public static void main(String[] args) {
		int[] nums={7,5,6,1,4,2};
		Arrays.sort(nums);
		System.out.println("Minimum = " + nums[0]);
		System.out.println("Maximum = " + nums[nums.length-1]);
		
		
	}

}
