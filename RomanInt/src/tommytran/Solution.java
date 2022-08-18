package tommytran;

public class Solution {

	public int romanToInt(String s) {

		char[] str = s.toUpperCase().toCharArray();
		int result = 0;
		int strLen = str.length - 1;

		for (int i = 0; i <= strLen; i++) {

			// testing
			System.out.printf("str length = %d , i = %d result = %d show whats processed => %c\n", strLen, i, result,
					str[i]);

			if (str[i] == 'M') {
				result += 1000;
			} else if (str[i] == 'D') {
				result += 500;
			} else if ((str[i] == 'C' && i == strLen)
					|| (str[i] == 'C' && i != strLen && (str[i + 1] != 'M' && str[i + 1] != 'D'))) {
				result += 100;
			} else if (str[i] == 'C' && i != strLen && str[i + 1] == 'M') {
				result += 900;
				i++;
			} else if (str[i] == 'C' && i != strLen && str[i + 1] == 'D') {
				result += 400;
				i++;
			} else if (str[i] == 'L') {
				result += 50;
			} else if ((str[i] == 'X' && i == strLen)
					|| (str[i] == 'X' && i != strLen && (str[i + 1] != 'C' && str[i + 1] != 'L'))) {
				result += 10;
			} else if (str[i] == 'X' && i != strLen && str[i + 1] == 'C') {
				result += 90;
				i++;
			} else if (str[i] == 'X' && i != strLen && str[i + 1] == 'L') {
				result += 40;
				i++;
			} else if (str[i] == 'V') {
				result += 5;
			} else if ((str[i] == 'I' && i == strLen)
					|| (str[i] == 'I' && i != strLen && (str[i + 1] != 'X' && str[i + 1] != 'V'))) {
				result+= 1;
			} else if (str[i] == 'I' && i != strLen && str[i + 1] == 'X') {
				result += 9;
				i++;
			} else if (str[i] == 'I' && i != strLen && str[i + 1] == 'V') {
				result += 4;
				i++;
			}
		}

		System.out.printf("Final Result = %d\n", result);

		return result;
	}
}
