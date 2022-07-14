import collections
import sys

t = int(sys.stdin.readline().rstrip())


def exec_case():
    _ = sys.stdin.readline().rstrip()
    input_: str = sys.stdin.readline().rstrip()

    num_of_problem = len(input_)
    p_list = list(input_)
    p_list_counter = collections.Counter(p_list)

    answer = num_of_problem + len(p_list_counter)
    print(answer)


for _ in range(t):
    exec_case()
