import sys

case_sentence: str = "-1"

vowel: list = ["a", "e", "i", "o", "u"]

while case_sentence != "#":
    case_sentence = str(sys.stdin.readline().rstrip().lower())

    if case_sentence == "#":
        break

    vowel_cnt = 0

    for i in range(len(case_sentence)):
        if case_sentence[i] in vowel:
            vowel_cnt += 1

    print(vowel_cnt)
