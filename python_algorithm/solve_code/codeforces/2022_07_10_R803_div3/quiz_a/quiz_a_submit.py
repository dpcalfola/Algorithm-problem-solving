import sys

t = int(sys.stdin.readline().rstrip())


def exec_case():
    m = int(sys.stdin.readline().rstrip())

    k = 1

    while True:
        if m < 10:
            print(m - 1)
            return
        if m < 10 ** k:
            answer = m - 10 ** (k - 1)
            print(answer)
            return
        else:
            k += 1


for _ in range(t):
    exec_case()
