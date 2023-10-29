import sys

num_of_case = int(sys.stdin.readline().rstrip())

for _ in range(num_of_case):
    length_of_arr = int(sys.stdin.readline().rstrip())
    arr_1 = list(map(int, sys.stdin.readline().split()))
    arr_2 = list(map(int, sys.stdin.readline().split()))
    sum_ = 0

    for i in range(0, length_of_arr - 1):
        value1 = abs(arr_1[i] - arr_1[i + 1]) + abs(arr_2[i] - arr_2[i + 1])
        value2 = abs(arr_1[i] - arr_2[i + 1]) + abs(arr_2[i] - arr_1[i + 1])
        sum_ += min(value1, value2)

    print(sum_)
