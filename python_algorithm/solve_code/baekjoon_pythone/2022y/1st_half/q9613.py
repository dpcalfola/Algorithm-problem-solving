import sys


def get_gcd(a: int, b: int) -> int:
    while a != 0 and b != 0:
        if a < b:
            a, b = b, a
        a = a % b
    return b


def get_gcd_sum(arr: list) -> int:
    arr.pop(0)
    sum_of = 0
    for i in range(0, len(arr) - 1):
        for j in range(i + 1, len(arr)):
            sum_of += get_gcd(arr[i], arr[j])
    return sum_of


test_case = int(sys.stdin.readline().rstrip())

for _ in range(test_case):
    test_list = list(map(int, sys.stdin.readline().split()))
    print(get_gcd_sum(test_list))
