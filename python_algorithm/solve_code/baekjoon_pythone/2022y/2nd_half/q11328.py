import sys

T: int = int(sys.stdin.readline().rstrip())


def solve_case():
    string_a, string_b = map(str, sys.stdin.readline().split())

    list_a: list = list(string_a)
    list_b: list = list(string_b)

    list_a.sort()
    list_b.sort()

    print("Possible") if list_a == list_b else print("Impossible")


for _ in range(T):
    solve_case()
