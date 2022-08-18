package tommytran;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4};
		
		Solution sol = new Solution();
		sol.runningSum(nums);
	}

}

class Solution {
	public int[] runningSum(int[] nums) {
		
		int result = 0;
		int[] resultArr = new int[nums.length];
		
		for (int i = 0; i <= nums.length - 1; i++) {
			result += nums[i];
			resultArr[i] = result;
		}
		
		
//		System.out.println(Arrays.toString(resultArr));
//		System.out.println(result);
		return resultArr;
	}
}