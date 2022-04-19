# dp(1) = 1
# dp(2) = 2
# dp(3) = 4

# dp(4) => 1 + 3 -> dp(3) 개
#          2 + 2 -> dp(2) 개
#         3 + 1 -> dp(1) 개

# dp(5) => 1 + 4 -> dp(4) 개
#         2 + 2 -> dp(3) 개
#         3 + 1 -> dp(2) 개

# dp(n) => 1 + (n-1) -> dp(n-1) 개
#         2 + (n-2) -> dp(n-2) 개
#         3 + (n-3) -> dp(n-3) 개


import sys

T = int(sys.stdin.readline().rstrip())

for _ in range(T):
    num = int(sys.stdin.readline().rstrip())
    memory = [0] * (num + 1)


    def dp(n):
        if n == 1:
            return 1
        if n == 2:
            return 2
        if n == 3:
            return 4
        if memory[n]:
            return memory[n]
        else:
            memory[n] = dp(n - 1) + dp(n - 2) + dp(n - 3)
            return memory[n]


    print(dp(num))
