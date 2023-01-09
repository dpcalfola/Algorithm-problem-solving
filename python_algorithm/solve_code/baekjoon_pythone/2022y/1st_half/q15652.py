import sys

N, M = map(int, sys.stdin.readline().split())

arr = []


def dfs(n, m):
    if len(arr) == m:
        print(*arr)
        return
    for i in range(1, n + 1):
        if not arr:
            arr.append(i)
            dfs(n, m)
            arr.pop()
        else:
            if i >= arr[len(arr) - 1]:
                arr.append(i)
                dfs(n, m)
                arr.pop()


dfs(N, M)
