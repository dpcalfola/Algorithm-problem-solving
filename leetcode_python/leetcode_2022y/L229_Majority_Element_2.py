from typing import List


# find limit = [n/3]
# make set (remove reoeted item)
# if set item of count of the list is bigger than limit, append answer list

class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        answer = []
        limit = len(nums) / 3
        set_nums = set(nums)

        for i in set_nums:
            if nums.count(i) > limit:
                answer.append(i)

        return answer


s1 = Solution()

nums: List[int] = [1, 2]
answer_list = s1.majorityElement(nums)
print(answer_list)
