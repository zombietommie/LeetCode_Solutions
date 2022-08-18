package tommytran;

public class Main {

	public static void main(String[] args) {
		String[] test = { "flower", "flow", "flight" };
		Solution sol = new Solution();
		sol.longestCommonPrefix(test);

	}

}

class Solution {
	public String longestCommonPrefix(String[] strs) {
		String result = "";
		String textStart = "";
		String textCompare = "";
		
		textStart = strs[0];
		textCompare = strs[1];
		
		System.out.println(textStart.compareToIgnoreCase(textCompare));

//		char[] ch1;
//		char[] ch2;
//
//		for (int i = 0; i <= strs.length - 1; i++) {
//
//			if (i != strs.length - 1) {
//				textStart = strs[i];
//				textCompare = strs[i + 1];
//				ch1 = textStart.toCharArray();
//				ch2 = textCompare.toCharArray();
//			}
//
//			for (int x = 0; x <= textStart.length() - 1; x++) {
//				text
//			}
//		}

		return result;
	}
}