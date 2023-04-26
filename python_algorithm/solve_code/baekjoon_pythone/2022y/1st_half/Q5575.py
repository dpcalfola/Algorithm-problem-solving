import sys

list_answer_group = []


def worktime(start_h, start_m, start_s, end_h, end_m, end_s):
    result_h = end_h - start_h
    result_m = end_m - start_m
    result_s = end_s - start_s

    if result_s < 0:
        result_s += 60
        result_m -= 1

    if result_m < 0:
        result_m += 60
        result_h -= 1

    list_time = [result_h, result_m, result_s]
    return list_time


for _ in range(0, 3):
    start_h, start_m, start_s, end_h, end_m, end_s = map(
        int, sys.stdin.readline().split()
    )
    list_answer_group.append(worktime(start_h, start_m, start_s, end_h, end_m, end_s))

for i in range(0, 3):
    for j in range(0, 3):
        print(list_answer_group[i][j], end=" ")
    print()
