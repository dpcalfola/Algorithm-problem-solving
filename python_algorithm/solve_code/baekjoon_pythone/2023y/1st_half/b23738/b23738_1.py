"""
https://www.acmicpc.net/problem/23738
"""
import sys

input_string: str = sys.stdin.readline().rstrip()

# Dict of Replacement
replacement: dict = {
    "B": "v",
    "E": "ye",
    "H": "n",
    "P": "r",
    "C": "s",
    "Y": "u",
    "X": "h",
    "A": "a",
    "K": "k",
    "M": "m",
    "O": "o",
    "T": "t",
}

answer_string: str = ""
for i in range(len(input_string)):
    for key, value in replacement.items():
        if input_string[i] == key:
            answer_string += replacement[key]

print(answer_string)
