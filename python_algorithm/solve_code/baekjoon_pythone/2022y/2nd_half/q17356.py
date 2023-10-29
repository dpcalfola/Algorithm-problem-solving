import sys

a, b = map(int, sys.stdin.readline().split())

m = (b - a) / 400
answer = 1 / (1 + 10**m)

print(answer)
