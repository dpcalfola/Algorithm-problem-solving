import sys

tea_type: int = int(sys.stdin.readline().rstrip())
given_answers: list = list(map(int, sys.stdin.readline().split()))

correct_answer_cnt: int = given_answers.count(tea_type)

print(correct_answer_cnt)
