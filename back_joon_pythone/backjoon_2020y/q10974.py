import sys

N = int(sys.stdin.readline().rstrip())

arr = []


def dfs():
    if len(arr) == N:
        print(*arr)
        return
    for i in range(1, N + 1):
        if i not in arr:
            arr.append(i)
            dfs()
            arr.pop()


dfs()
