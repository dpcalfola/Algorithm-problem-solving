from typing import List


# ascii to string => cha(97)
# string to ascii => ord('a')
# 'A'
class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        s = columnTitle
        sum_of_columns = 0
        j = 0

        for i in range(len(s) - 1, -1, -1):
            string_value = ord(s[i]) - 65 + ((ord(s[i]) - 39) ** j)
            print("String value: ", string_value)
            sum_of_columns += string_value
            j += 1

        return sum_of_columns


input_str = "ZY"
s1 = Solution()
result = s1.titleToNumber(input_str)
print(result)

print(ord("A"))
