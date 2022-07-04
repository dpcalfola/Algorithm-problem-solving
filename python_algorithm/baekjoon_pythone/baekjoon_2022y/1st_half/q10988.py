import sys

str_ = sys.stdin.readline().rstrip()
str_reverse = str_[::-1]

print(1) if str_ == str_reverse else print(0)
