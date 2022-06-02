import sys

A, B = map(int, sys.stdin.readline().split())

result = (A+B)*(A-B)

print(result)