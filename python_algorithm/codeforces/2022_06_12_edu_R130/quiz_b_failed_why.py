import sys

n, q = map(int, sys.stdin.readline().split())
prices: list = list(map(int, sys.stdin.readline().split()))

prices.sort(reverse=True)

for _ in range(q):
    x, y = map(int, sys.stdin.readline().split())

    if x == y:
        x += 1

    # from index 0 to (x-1)
    purchased: list = prices[:x]

    # sum of y-th items from end of the list
    free_total_value: int = sum(purchased[-y::])
    print(free_total_value)
