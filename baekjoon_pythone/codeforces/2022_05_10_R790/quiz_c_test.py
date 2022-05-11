import sys

t = int(sys.stdin.readline().rstrip())


def sol(n: int, length: int):
    words = []
    answer = 0
    for _ in range(n):
        words.append(sys.stdin.readline().rstrip())

    print(words)


for _ in range(t):
    num_of_words, length_of_word = map(int, sys.stdin.readline().split())
    sol(num_of_words, length_of_word)
