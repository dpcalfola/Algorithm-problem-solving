import sys
from collections import deque

input_ = list(map(int, sys.stdin.readline().split()))
length = input_[0]
rotate_step = (input_[1] - 1) * -1
queue_ = deque(range(1, length + 1))

output: str = '<'

while queue_:
    queue_.rotate(rotate_step)
    output += str(queue_.popleft()) + ', '

output = output[:-2:]
output += '>'

print(output)
