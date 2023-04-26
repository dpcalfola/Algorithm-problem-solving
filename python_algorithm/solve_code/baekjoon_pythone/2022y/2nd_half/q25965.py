import sys

N = int(sys.stdin.readline().rstrip())


def mission(m: int) -> int:
    money_list: list = []
    case_total_money = 0

    #
    for mission_num in range(m):
        money: list = list(map(int, sys.stdin.readline().split()))
        money_list.append(money)

    #
    k, d, a = map(int, sys.stdin.readline().split())

    # Calculate each mission
    # And add result to case_total_money if it is positive
    for mission_num in range(m):
        mission_result = (
            money_list[mission_num][0] * k
            - money_list[mission_num][1] * d
            + money_list[mission_num][2] * a
        )

        case_total_money += mission_result if mission_result > 0 else 0

    return case_total_money


for case in range(N):
    M: int = int(sys.stdin.readline().rstrip())
    print(mission(M))
