"""
N: 끊어진 기타 줄의 수
M: 브랜드의 수
2번째 줄부터의 입력: 6개 세트 가격, 1개 가격
"""

# Input
import math
import sys

n, m = map(int, sys.stdin.readline().split())
min_set_price, min_unit_price = sys.maxsize, sys.maxsize

for _ in range(m):
    input_set_price, input_unit_price = map(int, sys.stdin.readline().split())
    min_set_price: int = min(min_set_price, input_set_price)
    min_unit_price: int = min(min_unit_price, input_unit_price)


# EXEC
def calculate():
    # Case 1 : 모두 셋트로 구매
    case_1_price = math.ceil(n / 6) * min_set_price

    # Case 2 : set 으로 최대한 사고 나머지를 낱개로 구입
    buy_set_num = n // 6
    buy_unit_num = n % 6
    case_2_price = buy_set_num * min_set_price + buy_unit_num * min_unit_price

    # Case 3 : 모두 낱개로 구입
    case_3_price = n * min_unit_price

    answer = min(case_1_price, case_2_price, case_3_price)
    print(answer)


calculate()
