import sys

a, b, c, d = map(str, sys.stdin.readline().split())

ab: int = int(a + b)
cd: int = int(c + d)

print(ab + cd)
