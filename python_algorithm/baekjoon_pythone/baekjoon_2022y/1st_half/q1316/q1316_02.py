import sys


def is_group_word(s: str) -> bool:
    for i in range(0, len(s) - 1):
        if s[i] == s[i + 1]:
            continue
        if s[i] in s[i + 1:]:
            return False

    return True


N = int(sys.stdin.readline().rstrip())
cnt = 0

for _ in range(N):
    if is_group_word(sys.stdin.readline().rstrip()):
        cnt += 1

print(cnt)
