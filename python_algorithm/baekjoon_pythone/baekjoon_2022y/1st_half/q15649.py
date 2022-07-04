import sys

N, M = map(int, sys.stdin.readline().split())
arr = []


def dfs(n, m):
    if len(arr) == m:
        print(*arr)
    for i in range(1, n + 1):
        if i not in arr:
            arr.append(i)
            dfs(n, m)
            arr.pop()


dfs(N, M)
