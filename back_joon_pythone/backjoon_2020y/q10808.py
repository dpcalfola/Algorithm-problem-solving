import sys

char_list = list(sys.stdin.readline().rstrip())
answer_list = []

# 'a' 의 아스키코드 값 == 97
# 'z' 의 아스키코드 값 == 122
for i in range(97, 123):
    answer_list.append(char_list.count(chr(i)))

print(*answer_list)

