import sys

sys.setrecursionlimit(10 ** 6)

T = int(sys.stdin.readline().rstrip())

for _ in range(T):
    num = int(sys.stdin.readline().rstrip())

    if num == 0:
        print(1, 0)
        continue

    memo = [0] * (num + 1)


    def fibo(n):
        if n == 0:
            return 0
        if n == 1:
            return 1
        if memo[n]:
            return memo[n]
        else:
            memo[n] = fibo(n - 1) + fibo(n - 2)
            return memo[n]


    print(fibo(num - 1), fibo(num))
