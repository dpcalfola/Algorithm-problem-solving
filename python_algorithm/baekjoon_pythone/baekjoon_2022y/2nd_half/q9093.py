import sys

T: int = int(sys.stdin.readline().rstrip())


def exec_case():
    words: list = list(sys.stdin.readline().split())

    for word in words:
        reversed_word = word[::-1]
        print(reversed_word, end=' ')


for _ in range(T):
    exec_case()
