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
}

answer_string: str = ""

for cha in input_string:
    if cha in replacement:
        answer_string += replacement[cha]
    else:
        answer_string += cha.lower()

print(answer_string)
