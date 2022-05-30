import sys

s = list(sys.stdin.readline().rstrip())
answer = 'true'

while len(s) > 1:
    if s.pop(0) != s.pop():
        answer = 'false'
        break

print(answer)
