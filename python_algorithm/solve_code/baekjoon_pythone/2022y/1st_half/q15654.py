import sys

N, M = map(int, sys.stdin.readline().split())
nums = list(map(int, sys.stdin.readline().split()))

arr = []
nums.sort()


def dfs(m):
    if len(arr) == m:
        print(*arr)
        return
    for i in nums:
        if i not in arr:
            arr.append(i)
            dfs(m)
            arr.pop()


dfs(M)
