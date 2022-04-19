import sys

number_of_student = int(sys.stdin.readline())
score_list = list(map(int, sys.stdin.readline().split()))

score_list.sort()

result = score_list[len(score_list) - 1] - score_list[0]
print(result)
