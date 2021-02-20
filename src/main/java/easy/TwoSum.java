package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>(); // init HashMap
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i]; // deduct current number from target
			if (map.containsKey(complement)) { // check if Map already contains a pair
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i); //put current number to Map and its index
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
