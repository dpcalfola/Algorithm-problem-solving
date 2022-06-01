import sys

num = int(sys.stdin.readline().rstrip())

for i in range(num):
    print('*' * (i + 1), end='')
    print(' ' * (num - (i + 1)), end='')
    print(' ' * (num - (i + 1)), end='')
    print('*' * (i + 1), end='')
    print()

for i in range(num - 1):
    print('*' * (num - (i + 1)), end='')
    print(' ' * (i + 1), end='')
    print(' ' * (i + 1), end='')
    print('*' * (num - (i + 1)), end='')
    print()
