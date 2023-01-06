import sys

input_line: str = sys.stdin.readline().rstrip()

colon_position = input_line.index(':')

n: int = int(input_line[0:colon_position])
m: int = int(input_line[colon_position + 1:])


def get_gcd(a: int, b: int) -> int:
    while a != 0 and b != 0:
        if a < b:
            a, b = b, a
        a = a % b
    return b


gcd = get_gcd(n, m)

print(f'{n // gcd}:{m // gcd}')
