import sys

N: int = int(sys.stdin.readline().rstrip())

binary_: bin = bin(N)
binary_str: str = binary_[2:]
reversed_binary_str: str = binary_str[::-1]
decimal_reversed_binary: int = int(reversed_binary_str, 2)

print(decimal_reversed_binary)
