import sys

T = int(sys.stdin.readline().rstrip())

for _ in range(T):
    N = sys.stdin.readline().rstrip()
    nums = list(map(int, sys.stdin.readline().split()))
    print(sum(nums))
