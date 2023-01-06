import sys

N = int(sys.stdin.readline().rstrip())
arr = list(map(int, sys.stdin.readline().split()))


def nge(c: int, a: list):
    for i in a:
        if i > c:
            print(i)
            return
    print(-1)
    return


while arr:
    current = arr.pop(0)
    nge(current, arr)
