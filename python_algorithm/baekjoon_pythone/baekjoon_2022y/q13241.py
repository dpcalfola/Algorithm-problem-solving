import sys


# Euclidean algorithm
def get_gcd(a: int, b: int) -> int:
    while a != 0 and b != 0:
        if a < b:
            a, b = b, a
        a = a % b
    return b


A, B = map(int, sys.stdin.readline().split())

gcd = get_gcd(A, B)
lcm = A // gcd * B

print(lcm)
