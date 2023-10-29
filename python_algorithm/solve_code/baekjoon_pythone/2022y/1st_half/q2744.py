import sys

input_str: str = sys.stdin.readline().rstrip()
changed_str = ""

for i in range(len(input_str)):
    if input_str[i].isupper():
        changed_str += input_str[i].lower()
    else:
        changed_str += input_str[i].upper()

print(changed_str)
