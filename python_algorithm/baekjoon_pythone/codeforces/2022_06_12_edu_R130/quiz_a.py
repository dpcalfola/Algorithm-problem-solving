import sys

T = int(sys.stdin.readline().rstrip())

for _ in range(T):
    n, m = map(int, sys.stdin.readline().split())
    distance_list: list = list(map(int, sys.stdin.readline().split()))

    sum_of_distance: int = sum(distance_list)
    need_energy = sum_of_distance - m

    print(need_energy if need_energy > 0 else 0)
