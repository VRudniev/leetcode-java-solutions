package easy;

/**
 *
 * https://leetcode.com/problems/valid-palindrome/
 *
 * Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 *
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 */
public class ValidPalindrome {

	public boolean isPalindrome(String s) {
		String defensiveCopy = s;
		defensiveCopy = defensiveCopy.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		int j = 0;
		for (int i = defensiveCopy.length() - 1; i > 0; i--) {
			if (j != i && defensiveCopy.charAt(i) != defensiveCopy.charAt(j))
				return false;
			j++;
		}
		return true;
	}

}
