
public class Main {

	public static void main(String[] args) {

		int[] nums = { 1, 7, 3 };

		Solution sol = new Solution();
		sol.pivotIndex(nums);
	}
}

class Solution {

	public int pivotIndex(int[] nums) {

		int resultLeft, resultRight;
		
		// check length
		if (nums.length == 3) {
			resultLeft = 0;
			resultRight = nums[1] + nums[2];
			if (resultLeft == resultRight) {
				return resultLeft;
			} else {
				
			}
		}
		

		// Get Left Result
		for (int i = 0; i <= nums.length; i++) {
			
		}

		// Get Right Result

		return -1;
	}
}