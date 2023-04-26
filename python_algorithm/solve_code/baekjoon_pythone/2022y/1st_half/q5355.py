import sys

T: int = int(sys.stdin.readline().rstrip())

for _ in range(T):
    input_list: list = sys.stdin.readline().split()
    num: float = float(input_list[0])

    for i in range(1, len(input_list)):
        if input_list[i] == "@":
            num *= 3
        elif input_list[i] == "%":
            num += 5
        elif input_list[i] == "#":
            num -= 7

    print(f"{num:.2f}")
