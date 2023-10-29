import sys

fbi_list: list = []

for i in range(5):
    input_str: str = sys.stdin.readline().rstrip()

    if input_str.__contains__("FBI"):
        fbi_list.append(i + 1)

if fbi_list:
    print(*fbi_list)
else:
    print("HE GOT AWAY!")
