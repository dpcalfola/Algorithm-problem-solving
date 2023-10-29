import sys

num = int(sys.stdin.readline())

for i in range(0, num):
    for j in range(0, i):
        print(" ", end="")

    for j in range(num, i, -1):
        print("*", end="")

    print()
