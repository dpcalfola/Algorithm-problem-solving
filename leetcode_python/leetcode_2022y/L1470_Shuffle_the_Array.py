from typing import List


class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        answer_list = []
        for i in range(0, n):
            answer_list.append(nums[i])
            answer_list.append(nums[n + i])

        return answer_list


s1 = Solution()
nums = [1, 1, 2, 2]
n = 2

answer = s1.shuffle(nums, n)
print(answer)
