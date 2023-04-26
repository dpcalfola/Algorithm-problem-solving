import sys

t = int(sys.stdin.readline().rstrip())

for _ in range(t):
    input_ = sys.stdin.readline().rstrip()
    upper_input = input_.upper()

    if upper_input == "YES":
        print("YES")
    else:
        print("NO")
