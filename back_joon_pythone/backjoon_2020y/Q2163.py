# 가로로 쪼개는 횟수 : N-1
# 세로로 쪼개는 횟수 : (M-1)*N
# 쪼개는 횟수 : 가로 횟수 + 세로 횟수

import sys

N, M = sys.stdin.readline().split()
n = int(N)
m = int(M)
answer = (n - 1) + (m - 1) * n  # same as n*m-1

print(answer)
