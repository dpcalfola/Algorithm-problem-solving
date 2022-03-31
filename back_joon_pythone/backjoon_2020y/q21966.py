import sys

num = int(sys.stdin.readline())
input_str = sys.stdin.readline()


def abbr(s):
    middle_s = s[11:-12]
    middle_s = middle_s[:-1]

    if not middle_s.__contains__('.'):
        answer = s[:11] + '...' + s[-12:]
        print(answer)

    else:
        answer = s[:9] + '......' + s[-11:]
        print(answer)


if num < 26:
    print(input_str)
else:
    abbr(input_str)
