from typing import List


class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        half_size = len(nums) / 2
        nums_set = set(nums)
        print(nums_set)

        for i in nums_set:
            if nums.count(i) > half_size:
                return i

        return -1


# nums: List[int] = [2, 2, 1, 1, 1, 2, 2]
nums = [3, 2, 2, 3, 3]
s1 = Solution()

result = s1.majorityElement(nums)
print(result)
