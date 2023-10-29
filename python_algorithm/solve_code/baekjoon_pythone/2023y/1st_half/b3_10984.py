"""
https://www.acmicpc.net/problem/10984
"""
import sys

t: int = int(sys.stdin.readline().rstrip())


def exec_case(s: int):
    total_credit: float = 0
    total_score: float = 0.0

    for i in range(s):
        credit, score = map(float, sys.stdin.readline().rstrip().split())
        total_credit += credit
        total_score += credit * score

    avg_score = total_score / total_credit
    print(int(total_credit), end=" ")
    print(f'{avg_score:.1f}')


for _ in range(t):
    size_of_subject: int = int(sys.stdin.readline().rstrip())
    exec_case(s=size_of_subject)
