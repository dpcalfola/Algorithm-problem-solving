import sys

k: int = int(sys.stdin.readline().rstrip())


def exec_case(class_num: int):
    scores: list = list(map(int, sys.stdin.readline().split()))

    # Remove the number of students
    scores.pop(0)

    #
    scores.sort()
    highest_score: int = scores[-1]
    lowest_score: int = scores[0]

    # Get Largest gap
    largest_gap: int = 0
    for i in range(0, len(scores) - 1):
        gap = scores[i + 1] - scores[i]
        largest_gap = max(largest_gap, gap)

    # Print answer
    print(f"Class {class_num + 1}")
    print(f"Max {highest_score}, Min {lowest_score}, Largest gap {largest_gap}")
    # print(scores, highest_score, lowest_score)


for case_num in range(k):
    exec_case(case_num)
