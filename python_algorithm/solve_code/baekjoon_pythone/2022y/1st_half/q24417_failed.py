import sys

sys.setrecursionlimit(10**6)
N = int(sys.stdin.readline().rstrip())

memo = [0] * (20**8 + 1)
memo[1] = 1
memo[2] = 1


def fibo_dp(n):
    if n == 1 or n == 2:
        return 1

    if memo[n]:
        return memo[n]
    else:
        memo[n] = fibo_dp(n - 1) + fibo_dp(n - 2)
        return memo[n]


print(fibo_dp(N) % 1000000007, end=" ")
print(N - 2)
