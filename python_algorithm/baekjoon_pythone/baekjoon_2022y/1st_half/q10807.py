import sys

N = int(sys.stdin.readline().rstrip())
arr = list(map(int, sys.stdin.readline().split()))
v = int(sys.stdin.readline().rstrip())

num_of_v = arr.count(v)
print(num_of_v)
