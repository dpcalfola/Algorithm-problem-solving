import sys

input_num = int(sys.stdin.readline())

for i in range(0, input_num):
    for j in range(0, i):
        print(" ", end="")

    for j in range(2 * (input_num - i) - 1, 0, -1):
        print("*", end="")
    print()
