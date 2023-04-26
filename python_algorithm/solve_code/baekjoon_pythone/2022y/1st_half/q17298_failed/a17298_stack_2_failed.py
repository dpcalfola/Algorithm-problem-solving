import sys

N = int(sys.stdin.readline().rstrip())
stack = list(map(int, sys.stdin.readline().split()))

max_num = -1
rb = -1
result = []

for _ in range(N):
    current = stack.pop()

    if current > max_num:
        result.append(-1)
        max_num = current
        rb = current
        continue

    if stack:
        if current < stack[-1]:
            result.append(rb)
            rb = current
        else:
            result.append(rb)

result.reverse()
print(result)
