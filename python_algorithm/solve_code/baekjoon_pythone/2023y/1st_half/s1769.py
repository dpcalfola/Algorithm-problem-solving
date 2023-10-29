"""
https://www.acmicpc.net/problem/1769
"""
import sys

n = sys.stdin.readline().rstrip()


def sum_digit(num: str) -> str:
    digit_list: list[int] = [int(num[i]) for i in range(len(num))]
    return str(sum(digit_list))


cnt = 0
current: str = n

while True:
    if len(current) == 1:
        break
    current = sum_digit(current)
    cnt += 1

if int(current) % 3 == 0:
    print(f"{cnt}\nYES")
else:
    print(f"{cnt}\nNO")
