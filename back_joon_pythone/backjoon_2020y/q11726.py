import sys

dp = [0] * 1001
dp[1] = 1
dp[2] = 2

N = int(sys.stdin.readline().rstrip())

for i in range(3, 1001):
    # dp[i-1] : 마지막 타일이 세로로 1개
    # dp[i-2] : 마지막 타일이 가로로 2개
    dp[i] = dp[i - 1] + dp[i - 2]

result = dp[N] % 10007
print(result)
