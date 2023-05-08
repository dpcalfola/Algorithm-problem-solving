"""
https://www.acmicpc.net/problem/11170
"""
import sys

test_cases: int = int(sys.stdin.readline().rstrip())


def exec_case():
    cnt: int = 0
    min_num, max_num = map(int, sys.stdin.readline().rstrip().split())
    num_str_list: list[str] = [str(i) for i in range(min_num, max_num + 1)]

    for each_string in num_str_list:
        for char in each_string:
            if char == "0":
                cnt += 1

    print(cnt)


for _ in range(test_cases):
    exec_case()
