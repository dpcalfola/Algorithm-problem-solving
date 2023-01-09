import sys

N, M = map(int, sys.stdin.readline().split())

dic = {}

for _ in range(N):
    site, pw = map(str, sys.stdin.readline().split())
    dic[site] = pw

for _ in range(M):
    key = sys.stdin.readline().rstrip()
    print(dic[key])
