import sys

n: int = int(sys.stdin.readline().rstrip())

answer = n * (n + 1) // 2
print(answer)
