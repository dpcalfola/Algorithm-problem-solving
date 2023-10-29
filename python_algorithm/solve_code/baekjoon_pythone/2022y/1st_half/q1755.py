import sys


def num_to_string(n: int) -> str:
    to_string: str = ""

    num_string: dict = {
        "1": "one",
        "2": "two",
        "3": "three",
        "4": "four",
        "5": "five",
        "6": "six",
        "7": "seven",
        "8": "eight",
        "9": "nine",
        "0": "zero",
    }

    for cha_ in str(n):
        to_string += num_string[cha_]

    return to_string


M, N = map(int, sys.stdin.readline().split())

nums: list = [i for i in range(M, N + 1)]
string_nums: list = []

for number in nums:
    # 영문 변환과 원 숫자를 튜플 형태로 list에 담음
    string_nums.append((num_to_string(number), number))

# tuple의 첫번째 값(영문변환숫자)을 기준으로 정렬
string_nums.sort(key=lambda s: (s[0], s[1]))

# print answer
# 튜플의 두번째 값을 10개씩 출력
new_line_plag = 0
for e_1, e_2 in string_nums:
    print(e_2, end=" ")
    new_line_plag += 1

    if new_line_plag == 10:
        print()
        new_line_plag = 0
