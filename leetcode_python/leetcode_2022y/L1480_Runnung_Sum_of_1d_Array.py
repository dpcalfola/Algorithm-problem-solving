from typing import List


class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        answer_list = []
        sum_of = 0
        for i in nums:
            sum_of += i
            answer_list.append(sum_of)

        return answer_list


s1 = Solution()

nums = [1, 2, 3, 4]
answer = s1.runningSum(nums)
print(answer)
