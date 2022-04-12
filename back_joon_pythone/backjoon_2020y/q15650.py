import sys

N, M = map(int, sys.stdin.readline().split())
arr = []


def dfs(n, m):
    if len(arr) == m:
        print(*arr)
        return
    for i in range(1, n + 1):
        if not len(arr):
            arr.append(i)
            dfs(n, m)
            arr.pop()
            continue
        if (i not in arr) and (i > arr[len(arr) - 1]):
            arr.append(i)
            dfs(n, m)
            arr.pop()


dfs(N, M)
