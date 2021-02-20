package easy;

/**
 * https://leetcode.com/problems/reverse-integer/
 *
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 * Example 1:
 *
 * Input: x = 123
 * Output: 321
 * Example 2:
 *
 * Input: x = -123
 * Output: -321
 * Example 3:
 *
 * Input: x = 120
 * Output: 21
 * Example 4:
 *
 * Input: x = 0
 * Output: 0
 *
 */

public class ReverseInteger {

	public int reverse(int x) {
		int sign = x >= 0 ? 1: -1; // get the original sign
		x *= sign; // take x module
		int reversed = 0;
		while (x > 0) {
			if (reversed > Integer.MAX_VALUE / 10)
				return 0;
			reversed *= 10;
			reversed += x % 10;
			x = x / 10;
		}
		return sign * reversed;
	}

}
