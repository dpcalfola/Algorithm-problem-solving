import sys

N, M = map(int, sys.stdin.readline().split())

arr = []

for _ in range(N):
    input_str: str = sys.stdin.readline().rstrip()
    arr.append(input_str[::-1])

for line in arr:
    print(line)
