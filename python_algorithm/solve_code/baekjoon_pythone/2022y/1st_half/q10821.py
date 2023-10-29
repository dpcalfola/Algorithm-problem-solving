import sys

input_: str = sys.stdin.readline().rstrip()

integers: list = input_.split(",")

print(len(integers))
