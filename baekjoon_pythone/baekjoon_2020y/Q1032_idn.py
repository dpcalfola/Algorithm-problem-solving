import sys

test_case = int(sys.stdin.readline())

input_list = []
for _ in range(0, test_case):
    input_list.append(sys.stdin.readline().rstrip())

print(input_list)

for i in range(0, len(input_list[0])):
    for j in range(0, test_case):
        check_char = input_list[j][i]
