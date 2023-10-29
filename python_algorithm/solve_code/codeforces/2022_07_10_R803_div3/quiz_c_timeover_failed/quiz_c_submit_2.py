import sys

t: int = int(sys.stdin.readline().rstrip())


def exec_case():
    # Input
    # First line is empty
    _ = sys.stdin.readline().rstrip()
    # n, k
    n, k = map(int, sys.stdin.readline().split())
    # Station list
    stations: list = list(map(int, sys.stdin.readline().split()))

    # Process k kind of queries
    for k in range(k):
        a, b = map(int, sys.stdin.readline().split())

        # # Condition.3 : There's no station
        # if not stations.__contains__(a) or not stations.__contains__(b):
        #     print('NO')
        #     continue

        # Condition.2

        try:
            start_station_index = stations.index(a)
            _ = stations.index(b, start_station_index)
            print("YES")
        except ValueError:
            # no route
            print("NO")

    return


for _ in range(t):
    exec_case()
