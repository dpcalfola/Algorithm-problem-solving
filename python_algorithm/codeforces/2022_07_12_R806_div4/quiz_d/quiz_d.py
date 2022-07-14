import sys

t: int = int(sys.stdin.readline().rstrip())


def exec_case():
    num_of_string: int = int(sys.stdin.readline().rstrip())
    strings_: list = []
    answer: str = ''

    for i in range(num_of_string):
        input_string: str = sys.stdin.readline().rstrip()
        strings_.append(input_string)

    def get_binary(s: str):

        len_of_s: int = len(s)

        for position in range(1, len_of_s):
            s_1 = s[:position]
            s_2 = s[position:]

            if not strings_.__contains__(s_1) or not strings_.__contains__(s_2):
                continue

            if strings_.__contains__(s_1) and strings_.__contains__(s_2):
                return '1'

        return '0'

    for string_ in strings_:
        answer += get_binary(string_)

    print(answer)


for _ in range(t):
    exec_case()
