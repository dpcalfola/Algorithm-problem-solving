import sys
sys.setrecursionlimit(300000)

num = int(sys.stdin.readline().rstrip())
memoization = [0] * (num + 1)


def fibo(n):
    if n == 1 or n == 2:
        return 1
    if memoization[n]:
        return memoization[n]
    else:
        memoization[n] = fibo(n - 1) + fibo(n - 2)
        return memoization[n]


print(fibo(num))
