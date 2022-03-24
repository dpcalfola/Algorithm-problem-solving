import sys


def get_answer(yut):
    value_of_yut = sum(yut)

    if value_of_yut == 3:
        return "A"
    elif value_of_yut == 2:
        return "B"
    elif value_of_yut == 1:
        return "C"
    elif value_of_yut == 0:
        return "D"
    elif value_of_yut == 4:
        return "E"


for _ in range(0, 3):
    input_yut = list(map(int, sys.stdin.readline().split()))
    print(get_answer(input_yut))
