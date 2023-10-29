# Backjoon b3 q1267

import math
import sys

N: int = int(sys.stdin.readline().rstrip())
call_time_list: list = list(map(int, sys.stdin.readline().split()))


def fee_calculator(criteria: str, unit_time: int, unit_fee: int) -> int:
    total_fee: int = 0

    for call_time in call_time_list:
        fee_cnt: int = math.floor(call_time / unit_time) + 1
        each_fee: int = fee_cnt * unit_fee

        total_fee += each_fee

    return total_fee


# Meaning of fee tuple -> (criteria_initial, unit_time, unit_fee)
criteria_yongSic: tuple[str, int, int] = ("Y", 30, 10)
criteria_manSic: tuple[str, int, int] = ("M", 60, 15)

# Calculate each fee
youngSic_fee = fee_calculator(
    criteria_yongSic[0], criteria_yongSic[1], criteria_yongSic[2]
)
manSic_fee = fee_calculator(criteria_manSic[0], criteria_manSic[1], criteria_manSic[2])

# Print answer
if youngSic_fee == manSic_fee:
    print(f"Y M {youngSic_fee}")
elif youngSic_fee < manSic_fee:
    print(f"Y {youngSic_fee}")
elif manSic_fee < youngSic_fee:
    print(f"M {manSic_fee}")
