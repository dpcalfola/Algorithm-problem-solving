import sys
from collections import deque

N = int(sys.stdin.readline().rstrip())
stack = list(map(int, sys.stdin.readline().split()))

maximum = -1
big_group = deque()
result = deque()

while stack:
    current = stack.pop()
    if current > maximum:
        result.appendleft(-1)
        maximum = current
    else:
        has_b = False
        for b in big_group:
            if current < b:
                result.appendleft(b)
                has_b = True
                break
        if not has_b:
            result.appendleft(maximum)

    big_group.appendleft(current)

print(*result)
