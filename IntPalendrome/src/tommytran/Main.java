package tommytran;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();

		sol.isPalendrome(22);
	}
}

class Solution {
	public boolean isPalendrome(int x) {

		String num = Integer.toString(x);
		char[] numArr = new char[num.length()];
		char[] revNum = new char[num.length()];
		int j = 1;

		for (int i = 0; i < num.length(); i++) {
			numArr[i] = num.charAt(i);

			revNum[i] = num.charAt(num.length() - j);
			j++;
		}
		
		String strNum = String.valueOf(numArr);
		String strRev = String.valueOf(revNum);

		if (strNum.equals(strRev)) {
			System.out.println("True");
			return true;
		} else {
			System.out.println("False");
			return false;
		}
	}

}