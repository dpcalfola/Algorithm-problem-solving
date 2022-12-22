import sys

N: int = int(sys.stdin.readline().rstrip())

multi_taps: list[int] = []

for i in range(N):
    tap_hole_num: int = int(sys.stdin.readline().rstrip())
    multi_taps.append(tap_hole_num)

answer = sum(multi_taps) - (N - 1)
print(answer)
