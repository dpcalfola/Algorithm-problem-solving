import sys
from collections import deque

N = int(sys.stdin.readline().rstrip())
stack = list(map(int, sys.stdin.readline().split()))

maximum = -1
big_group = []
result = []

while stack:
    current = stack.pop()
    if current > maximum:
        result.append(-1)
        maximum = current
    else:
        has_b = False
        for b in big_group:
            if current < b:
                result.append(b)
                has_b = True
                break
        if not has_b:
            result.append(maximum)

    big_group.insert(0, current)

result.reverse()
print(*result)
