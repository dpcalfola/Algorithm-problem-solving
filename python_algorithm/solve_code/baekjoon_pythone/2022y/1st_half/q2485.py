import sys

input_a = list(map(int, sys.stdin.readline().split()))
input_b = list(map(int, sys.stdin.readline().split()))

total = input_a[0] * input_a[1]

answer_list = []

for i in input_b:
    answer_list.append(i - total)

print(*answer_list)
