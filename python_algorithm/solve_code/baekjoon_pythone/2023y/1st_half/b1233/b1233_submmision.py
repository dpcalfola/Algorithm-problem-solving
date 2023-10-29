"""
https://www.acmicpc.net/problem/1233
"""

import sys

# Get s1, s2, s3
dices_size: list[int] = list(map(int, sys.stdin.readline().split()))
size_1, size_2, size_3 = dices_size[0], dices_size[1], dices_size[2]


# Make list of values for each dices
def make_dice_value(size: int) -> list[int]:
    values: list[int] = [i + 1 for i in range(size)]
    return values


s1_values = make_dice_value(size_1)
s2_values = make_dice_value(size_2)
s3_values = make_dice_value(size_3)

# Make result dictionary
result_dict: dict = {}

# Get possibility values
for s1 in s1_values:
    for s2 in s2_values:
        for s3 in s3_values:
            sum_of_values = s1 + s2 + s3
            if sum_of_values not in result_dict:
                result_dict[sum_of_values] = 1
            else:
                result_dict[sum_of_values] += 1

# Get the largest value in result_dict
largest_value: int = max(result_dict.values())
# Make a key list which has largest_value
largest_key_list: list[int] = [key for key, value in result_dict.items() if value == largest_value]
# Sort it for get the smallest key
largest_key_list.sort()
# Print it
print(largest_key_list[0])
