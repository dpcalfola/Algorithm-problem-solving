import sys

n = int(sys.stdin.readline().rstrip())
binary_n = bin(n)
binary_n_remove_0b = binary_n[2:]
print(binary_n_remove_0b)
