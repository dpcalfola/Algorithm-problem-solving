# 가로로 쪼개는 횟수 : N-1
# 세로로 쪼개는 횟수 : (M-1)*N
# 쪼개는 횟수 : 가로 횟수 + 세로 횟수
# N-1 + (M-1)*N = M*N - 1

import sys

N, M = map(int, sys.stdin.readline().split())
print(N * M - 1)
