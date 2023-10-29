import sys

wrong_start_group = ["aba", "bab", "abb", "baa"]
wrong_end_group = ["aba", "bab", "aab", "bba"]


def execute(s: str):
    if len(s) == 1:
        print("NO")
        return

    if len(s) == 2:
        if s == "ab" or s == "ba":
            print("NO")
            return
        else:
            print("YES")
            return

    if s[:3:] in wrong_start_group or s[-3::] in wrong_end_group:
        print("NO")
        return

    for i in range(0, len(s) - 2):
        if s[i] != s[i + 1] and s[i + 1] != s[i + 2]:
            print("NO")
            return

    print("YES")
    return


t = int(sys.stdin.readline().rstrip())

for _ in range(t):
    input_s = sys.stdin.readline().rstrip()
    execute(input_s)
