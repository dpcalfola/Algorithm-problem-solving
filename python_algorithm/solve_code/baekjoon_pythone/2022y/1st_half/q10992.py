import sys

N = int(sys.stdin.readline().rstrip())

# 0 ... N-2
for i in range(N - 1):
    print(' ' * (N - i - 1), end='')
    print('*', end='')
    print(' ' * (2 * i - 1), end='')
    if i > 0:
        print('*')
    else:
        print()

# bottom line
print('*' * (N * 2 - 1))
