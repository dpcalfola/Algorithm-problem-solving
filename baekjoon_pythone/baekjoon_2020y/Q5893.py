import sys

input_num = sys.stdin.readline()

binary_input_num = int(input_num, 2)  # 2진수를 10진수로

answer_decimal = binary_input_num * 17
answer_binary = bin(answer_decimal)  # 10진수를 2진수로
answer = answer_binary[2:]

# print(binary_input_num)
# print(answer_binary)
print(answer)
