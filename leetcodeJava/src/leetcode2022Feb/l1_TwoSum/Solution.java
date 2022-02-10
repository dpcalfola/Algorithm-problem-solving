package leetcode2022Feb.l1_TwoSum;


class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] resultArr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    resultArr[0] = i;
                    resultArr[1] = j;
                    return resultArr;
                }
            }
        }
        return resultArr;
    }

}
