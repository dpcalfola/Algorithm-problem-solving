# 기차역의 범위 1 to 10**9
# 1 <= n <= 10**9
# 1 <= a, b <= 10**9

# n 개의 기차역: u1, u2, u3 ... un

# 가능성이 있다 기차는 방문한다 기차역을 한번 이상
# 아마도 u1, u2... 값을 복제한다

# k 개의 쿼리가 주어진다
# 쿼리는 포함한다 두개의 정수 a, b

# 매 쿼리는 결정한다 인지 아닌지 가능성이 있는지 여행할 가능성, 기차에 의해 , 기차역 a 부터 기차역 b 까지

# ex_
#   기차의 경로가 6개 역으로 구성되어 있다.
#   [3, 7, 1, 5, 1, 4]
#
#   3개의 쿼리
#       쿼리.1
#           a=3, b=5
#           가능성이 있다 여행할 가능성이 있다 기차역 3번에서 5번으로
#           경로는 구성된다 [3, 7, 1, 5]
#           답은 YSE
#       쿼리.2
#           a=1, b=7
#           1번에서 7번으로 갈수 없다, 기차는 반대방향으로 갈 수 없다
#           답은 NO
#       쿼리.3
#           a=3, b=10
#           3번에서 10번으로 갈 수 없다, 10번은 기차역 번호에 포함되지 않는다
#           답은 NO

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

    # TEST CODE : input
    # print(n, k)
    # print(stations)

    # Process function for each query
    def process_query():
        # print('a, b: ', a, b)

        # Condition.3 : There's no station
        if not stations.__contains__(a) or not stations.__contains__(b):
            # print('C3: ', stations, a, b)
            print('NO')
            return

        # Condition.2
        start_station_index = stations.index(a)
        try:
            _ = stations.index(b, start_station_index)
            # print('C1: ', stations, a, b)
            print('YES')
            return
        except ValueError:
            # no route
            print('NO')
            return

    # Process k kind of queries
    for k in range(k):
        a, b = map(int, sys.stdin.readline().split())
        process_query()

    return


for _ in range(t):
    exec_case()
