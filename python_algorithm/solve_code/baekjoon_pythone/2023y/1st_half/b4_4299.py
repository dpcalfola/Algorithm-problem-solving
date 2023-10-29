"""
https://www.acmicpc.net/problem/4299
"""
import sys

# s == sum, g == gap
s: int
g: int

s, g = map(int, sys.stdin.readline().rstrip().split())

# a+b = s
# a-b = g
# 2a = s+g
# 2b = s-g

double_a = s + g
double_b = s - g

if double_a % 2 == 0 and double_b % 2 == 0 and double_a >= 0 and double_b >= 0:
    a: int = double_a // 2
    b: int = double_b // 2
    # Swap for making a bigger than b
    if a < b:
        a, b = b, a
    print(a, b)

else:
    print(-1)
