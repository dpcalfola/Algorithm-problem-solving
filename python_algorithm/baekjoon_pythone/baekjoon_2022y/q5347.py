import sys


def get_gcd(a: int, b: int) -> int:
    while b != 0 and a != 0:
        if a < b:
            a, b = b, a
        a = a % b

    return b


testcase = int(sys.stdin.readline().rstrip())

for _ in range(testcase):
    input_list = list(map(int, sys.stdin.readline().split()))
    x = input_list[0]
    y = input_list[1]
    gcd = get_gcd(x, y)
    lcm = (x / gcd) * y
    print(int(lcm))
