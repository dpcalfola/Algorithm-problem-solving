import sys

words: list = []
answer: str = ""

for i in range(5):
    input_line: str = sys.stdin.readline().rstrip()
    chas_line = list(map(str, input_line))
    words.append(chas_line)

for i in range(15):
    for k in range(5):
        try:
            answer += words[k][i]
        except IndexError:
            pass

print(answer)
