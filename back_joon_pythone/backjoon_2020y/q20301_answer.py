import sys
from collections import deque


def reverse_josephus(queue_, rotate_step, rotate_direction):
    while True:
        counter = M

        while counter > 0:
            if not queue_:
                return

            # 오른쪽으로 돌아감 (왼쪽 회전)
            if rotate_direction == -1:
                queue_.rotate(rotate_step * rotate_direction)
                print(queue_.popleft())

            # 왼쪽으로 돌아감 (오른쪽 회전)
            else:
                queue_.rotate(rotate_step * rotate_direction)
                print(queue_.pop())

            counter -= 1

        rotate_direction = rotate_direction * -1


input_ = list(map(int, sys.stdin.readline().split()))
N = input_[0]
K = input_[1]
M = input_[2]

# rotate_step : K - 1
# rotate_direction : -1
initial_queue = deque(range(1, N + 1))

reverse_josephus(initial_queue, K - 1, -1)
