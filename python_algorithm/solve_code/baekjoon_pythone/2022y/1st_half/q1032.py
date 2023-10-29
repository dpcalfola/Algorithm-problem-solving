import sys

n: int = int(sys.stdin.readline().rstrip())

file_names: list = []
answer: str = ""

for _ in range(n):
    input_: str = sys.stdin.readline().rstrip()
    file_names.append(input_)

for position in range(len(file_names[0])):
    # first_cha == 첫번째 파일 이름의 position 위치의 글자
    # 이후 모든 파일에 대해 같은 위치의 글자가 한 번 이라도 같지 않으면 '?' 를 리턴
    first_cha: str = file_names[0][position]

    for name in file_names:
        current = name[position]

        # 다른 글자가 있는 경우 answer 에 '?' 를 더하고 다음 글자로 넘어감(break)
        if current != first_cha:
            answer += "?"
            break

    # position 위치의 글자가 '?'가 아님
    # 1) 모든 글자가 같음
    # 2) answer 의 position substring 위치에 글자가 없음 -> IndexError 발생
    try:
        answer += first_cha if answer[position] != "?" else ""
    except IndexError:
        answer += first_cha

print(answer)
