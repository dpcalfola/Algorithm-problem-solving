import sys

t: int = int(sys.stdin.readline().rstrip())


def exec_case():
    digit: int = int(sys.stdin.readline().rstrip())
    initial_nums: list = list(map(int, sys.stdin.readline().split()))
    answer_list: list = []

    for i in range(digit):
        _, order = map(str, sys.stdin.readline().split())
        sequence = list(order)
        num_of_d = sequence.count("D")
        num_of_u = sequence.count("U")

        sum_order = num_of_d - num_of_u

        result = (initial_nums[i] + sum_order) % 10
        answer_list.append(result)

    print(*answer_list)


for _ in range(t):
    exec_case()
