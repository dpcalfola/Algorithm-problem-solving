import sys

t = int(sys.stdin.readline().rstrip())


def sol(n: int, length: int):
    words = []
    answer = 0
    for _ in range(n):
        words.append(sys.stdin.readline().rstrip())

    for i in range(len(words[0])):
        sum_of = 0
        for j in range(n):
            print("cha_value:", ord(words[j][i]) - 96)
            sum_of += ord(words[j][i]) - 96
        avg = sum_of // n
        print("avg:", avg)
        for k in range(n):
            answer += abs((ord(words[k][i]) - 96) - avg)
    print(answer)


for _ in range(t):
    num_of_words, length_of_word = map(int, sys.stdin.readline().split())
    sol(num_of_words, length_of_word)
