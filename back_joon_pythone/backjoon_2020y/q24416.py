import sys

N = int(sys.stdin.readline().rstrip())

# index 1 = recursive
# index 2 = dynamic programing
cnt = [0]
memo = [0] * 41
memo[1] = 1
memo[2] = 1


def fibo_dp(n):
    if n == 1 or n == 2:
        return 1

    if memo[n]:
        return memo[n]
    else:
        memo[n] = fibo_dp(n - 1) + fibo_dp(n - 2)
        cnt[0] += 1
        return memo[n]


print(fibo_dp(N), end=" ")
print(*cnt)
