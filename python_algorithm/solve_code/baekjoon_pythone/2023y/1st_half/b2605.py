"""
https://www.acmicpc.net/problem/2605
"""
import sys

_: int = int(sys.stdin.readline().rstrip())
draw_list: list[int] = list(map(int, sys.stdin.readline().split(" ")))

answer: list[int] = []
student_cnt = 1

for d in draw_list:
    answer.insert(d, student_cnt)
    student_cnt += 1

answer.reverse()
print(*answer)
