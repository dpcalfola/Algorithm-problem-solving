import sys

sum_ = 0
xor_ = 0

N = int(sys.stdin.readline())

for i in range(N):
    in_v = list(map(int, sys.stdin.readline().split()))

    if in_v[0] == 1:
        sum_ += in_v[1]
        xor_ ^= in_v[1]
    if in_v[0] == 2:
        sum_ -= in_v[1]
        xor_ ^= in_v[1]
    if in_v[0] == 3:
        print(sum_)
    if in_v[0] == 4:
        print(xor_)
