"""
https://www.acmicpc.net/problem/10991
"""
import sys

n: int = int(sys.stdin.readline().rstrip())

asterisk_space_string = "* "
space_string = " "

for i in range(n):
    line: str = ""
    line += space_string * (n - i - 1)
    line += asterisk_space_string * (i + 1)
    line.rstrip()
    print(line)
