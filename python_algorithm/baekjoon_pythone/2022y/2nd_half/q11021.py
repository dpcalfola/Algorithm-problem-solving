import sys

t = int(sys.stdin.readline().rstrip())

for case in range(t):
    a, b = map(int, sys.stdin.readline().split())
    sum_ = a + b
    print(f'Case #{case + 1}: {sum_}')
