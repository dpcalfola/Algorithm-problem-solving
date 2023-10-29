import sys

while True:
    input_: str = sys.stdin.readline().rstrip()

    if input_ == "END":
        break

    reversed_input = input_[::-1]
    print(reversed_input)
