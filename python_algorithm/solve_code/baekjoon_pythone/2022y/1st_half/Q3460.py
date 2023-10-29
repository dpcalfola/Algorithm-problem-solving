import sys

test_case = int(sys.stdin.readline())


def print_on_binary_position(n):
    str_binary = str(format(n, "b"))
    # print(str_binary)
    position_list = []
    for i in range(0, len(str_binary)):
        if str_binary[i] == "1":
            position = len(str_binary) - 1 - i
            position_list.append(position)

    position_list.sort()
    print(str(position_list).replace("[", "").replace("]", "").replace(",", ""))


for _ in range(0, test_case):
    print_on_binary_position(int(sys.stdin.readline()))
