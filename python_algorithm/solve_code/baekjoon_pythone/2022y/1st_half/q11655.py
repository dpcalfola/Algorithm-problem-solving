import sys

input_str: str = sys.stdin.readline().rstrip()
new_cha: str = ""

# Process
for c in input_str:
    # If c is number or space
    if not c.isalpha():
        new_cha += c
        continue

    ascii_c: int = ord(c)

    # If c is lowercase
    if 97 <= ascii_c <= 122:
        ascii_c += 13
        if ascii_c > 122:
            ascii_c -= 26

    # If c is Uppercase
    if 65 <= ascii_c <= 90:
        ascii_c += 13
        if ascii_c > 90:
            ascii_c -= 26

    # Append new character
    new_cha += chr(ascii_c)

print(new_cha)

# ascii code
# a 97
# z 122
# A 65
# Z 90
# 0 48
# 1 49
# 9 57
