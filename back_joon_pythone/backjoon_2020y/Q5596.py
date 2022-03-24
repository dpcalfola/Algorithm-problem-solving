import sys

input_list_A = map(int, sys.stdin.readline().split())
input_list_B = map(int, sys.stdin.readline().split())

sum_A = sum(input_list_A)
sum_B = sum(input_list_B)

answer = max(sum_A, sum_B)

print(answer)
