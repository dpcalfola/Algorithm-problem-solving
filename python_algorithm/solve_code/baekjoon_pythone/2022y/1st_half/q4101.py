import sys

while True:
    input_list = list(map(int, sys.stdin.readline().split()))
    a = input_list[0]
    b = input_list[1]

    if a == 0 and b == 0:
        break

    if a > b:
        print('Yes')
    else:
        print('No')
