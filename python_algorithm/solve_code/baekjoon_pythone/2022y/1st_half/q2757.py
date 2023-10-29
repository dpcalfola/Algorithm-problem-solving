import sys


def get_char(n: int) -> chr:
    s = ""

    while n != 0:
        reminder = n % 26
        n = n // 26

        if reminder == 0:
            s += "Z"
            n -= 1
        else:
            s += chr(64 + reminder)

    return s[::-1]


while True:
    string = sys.stdin.readline().rstrip()

    if string == "R0C0":
        break

    index_c = string.index("C")
    r = string[1:index_c:]
    c = string[index_c + 1 : :]

    answer = get_char(int(c)) + r
    print(answer)
