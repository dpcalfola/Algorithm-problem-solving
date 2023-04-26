import sys

T = int(sys.stdin.readline().rstrip())

for i in range(T):
    n = sys.stdin.readline()
    s_1 = int(n[0]) + int(n[1]) + int(n[2])
    s_2 = int(n[3]) + int(n[4]) + int(n[5])
    if s_1 == s_2:
        print("YES")
    else:
        print("NO")
