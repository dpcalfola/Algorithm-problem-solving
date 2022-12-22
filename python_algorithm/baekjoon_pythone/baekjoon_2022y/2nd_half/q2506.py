import sys

N: int = int(sys.stdin.readline().rstrip())
score_list: list[int] = list(map(int, sys.stdin.readline().split()))

continue_cnt = 0
total_score = 0

for score in score_list:
    if score == 1:
        continue_cnt += 1
        total_score += continue_cnt
    else:
        continue_cnt = 0

print(total_score)
