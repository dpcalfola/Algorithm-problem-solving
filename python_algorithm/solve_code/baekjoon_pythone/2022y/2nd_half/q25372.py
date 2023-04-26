import sys

t = int(sys.stdin.readline().rstrip())


def exec_case():
    input_ = sys.stdin.readline().rstrip()
    print("yes") if 6 <= len(input_) <= 9 else print("no")


for _ in range(t):
    exec_case()
