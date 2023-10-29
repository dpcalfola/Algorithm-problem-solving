import sys

t = int(sys.stdin.readline().rstrip())

for _ in range(t):
    n, r, b = map(int, sys.stdin.readline().split())
    arr = []
    col = r // (b + 1)
    reminder = r % (b + 1)
    for _ in range(b + 1):
        arr.append("R" * col)
        arr.append("B")
    arr.pop()
    print("reminder :", reminder)
    print(arr)
    step = 1
    for _ in range(reminder):
        arr.insert(step, "R")
        step += 2
        step += 1
    print(arr)
    print("".join(arr))
