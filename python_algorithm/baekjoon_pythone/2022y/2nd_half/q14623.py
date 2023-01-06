import sys

input_a = sys.stdin.readline().rstrip()
input_b = sys.stdin.readline().rstrip()

int_a: int = int(input_a, 2)
int_b: int = int(input_b, 2)

a_by_b: int = int_a * int_b
a_by_b_bin: bin = bin(a_by_b)

print(a_by_b_bin[2:])
