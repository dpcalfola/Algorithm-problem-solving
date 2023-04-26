import sys

input_list = list(map(int, sys.stdin.readline().split()))
answer = input_list[0] * input_list[1] // 2
print(answer)
