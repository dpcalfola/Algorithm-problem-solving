import sys

t = int(sys.stdin.readline().rstrip())


def sol(n: int, l: list):
    l.sort()
    min_n = l[0]
    sum_of = 0

    for candy in l:
        sum_of += candy - min_n

    print(sum_of)


for _ in range(t):
    input_n = int(sys.stdin.readline().rstrip())
    input_l = list(map(int, sys.stdin.readline().split()))
    sol(input_n, input_l)
