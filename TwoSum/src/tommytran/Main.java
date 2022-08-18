package tommytran;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] test = { 3, 3, 6 };

		Solution mySol = new Solution();

		mySol.twoSum(test, 6);
	}

}

class Solution {
	public int[] twoSum(int[] nums, int target) {

		int num1; // assign as first number
		int num2; // assign as second number
		int result; // used to get result from two number tests
		int[] answer = new int[2];

		if (nums.length == 2) {
			result = nums[0] + nums[1];
			if (result == target) {
				answer[0] = 0;
				answer[1] = 1;
			}

		} else {
			for (int i = 0; i <= nums.length - 1; i++) {
				for (int x = 0; x <= nums.length - 2; x++) {
					num1 = nums[x];
					num2 = nums[i];
					if (!(x == i)) {
						result = num1 + num2;
						if (result == target) {
							answer[0] = i; // store first number
							answer[1] = x; // store second number
						}
					}

				}
			}
		}

		return answer;
	}
}
