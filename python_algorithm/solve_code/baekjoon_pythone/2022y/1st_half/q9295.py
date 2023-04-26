import sys

T = int(sys.stdin.readline().rstrip())

for i in range(T):
    a, b = map(int, sys.stdin.readline().split())
    sum_ = a + b
    case_num = i + 1
    print(f"Case {case_num}:", sum_)
