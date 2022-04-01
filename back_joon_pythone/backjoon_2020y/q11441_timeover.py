import sys

list_size = int(sys.stdin.readline().rstrip())
arr = list(map(int, sys.stdin.readline().split()))
num = int(sys.stdin.readline())

answer_list = []

for _ in range(num):
    s_x, s_y = sys.stdin.readline().split()
    x, y = int(s_x), int(s_y)
    sum_of = 0
    for i in range(x - 1, y):
        sum_of += arr[i]
    answer_list.append(sum_of)

for i in answer_list:
    print(i)
