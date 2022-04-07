import copy
import sys


def print_lcm(x: int, y: int):
    a = copy.deepcopy(x)
    b = copy.deepcopy(y)

    while True:
        # a should be always lager tnan b
        if a < b:
            a, b = b, a

        if a % b == 0:
            gcd = b
            break
        else:
            b = a % b

    lcm = int((x / gcd) * y)
    print(lcm)


test_case = int(sys.stdin.readline().rstrip())

for _ in range(test_case):
    input_list = list(map(int, sys.stdin.readline().split()))
    print_lcm(input_list[0], input_list[1])
