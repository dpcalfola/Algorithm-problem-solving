# 백준 2108 통계학

# 최빈값 - dictionary counter 함수 이용

import collections
import sys

N = int(sys.stdin.readline().rstrip())
list_a = []
for _ in range(N):
    list_a.append(int(sys.stdin.readline().rstrip()))

# Sort ascending order
list_a.sort()

# Answer 1 : Arithmetic mean
sum_a = sum(list_a)
avg = round(sum_a / N)
print(avg)

# Answer 2 : Median value
index_m = N // 2
print(list_a[index_m])

# Answer 3 : Mode (It means most common value)
counter_dic_a = collections.Counter(list_a)
mode_tuple_list = counter_dic_a.most_common()

if len(mode_tuple_list) == 1:
    # The case list_a has the same value
    print(mode_tuple_list[0][0])

elif len(mode_tuple_list) > 1 and mode_tuple_list[0][1] != mode_tuple_list[1][1]:
    # The case mode value is the only one
    print(mode_tuple_list[0][0])

else:
    # The case mode values are more than one
    # Print the second-smallest value
    print(mode_tuple_list[1][0])

# Answer 4 : Range
range_value = list_a[N - 1] - list_a[0]
print(range_value)
