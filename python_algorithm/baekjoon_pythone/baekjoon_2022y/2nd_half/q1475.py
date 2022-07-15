import collections
import math
import sys

room_strs: list = list(sys.stdin.readline().rstrip())

r_numbers = list(map(int, room_strs))
six_cnt = 0

for i in range(len(r_numbers)):
    if r_numbers[i] == 9:
        r_numbers[i] = 6

r_counter = collections.Counter(r_numbers)
six_cnt = r_counter[6]
r_counter[6] = 0

need_six_nine = math.ceil(six_cnt / 2)
most_common = r_counter.most_common(1)

answer = max(need_six_nine, most_common[0][1])

print(answer)
