"""
https://www.acmicpc.net/problem/10214
"""
import sys

t: int = int(sys.stdin.readline().rstrip())


def solve_case():
    sum_of_y: int = 0
    sum_of_k: int = 0

    # Get score 9 times
    for _ in range(9):
        y, k = map(int, sys.stdin.readline().rstrip().split(" "))
        sum_of_y += y
        sum_of_k += k

    if sum_of_y > sum_of_k:
        print("Yonsei")
    elif sum_of_k > sum_of_y:
        print("Korea")
    elif sum_of_k == sum_of_y:
        print("Draw")


for _ in range(t):
    solve_case()
