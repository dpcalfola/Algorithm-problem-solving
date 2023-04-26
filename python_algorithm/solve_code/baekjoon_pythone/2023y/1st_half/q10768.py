"""
Backjoon #10768
객체지향적 접근 풀이
Object-oriented approach problem solving
"""

import sys


class DateRelation:
    # Constructor
    def __init__(self, input_month: int, input_date: int):
        self.today_month: int = input_month
        self.today_date: int = input_date

        self.special_month: int = 2
        self.special_date: int = 18

    # Problem solving method
    @property
    def special_relation(self) -> str:
        today_value: int = self.today_month * 100 + self.today_date
        special_value: int = self.special_month * 100 + self.special_date

        if today_value == special_value:
            return "Special"
        if today_value < special_value:
            return "Before"
        if today_value > special_value:
            return "After"


# SOLUTION STARTS !!

# Get input
month: int = int(sys.stdin.readline().rstrip())
day: int = int(sys.stdin.readline().rstrip())

# Create object and print answer property
today_relation: DateRelation = DateRelation(input_month=month, input_date=day)
print(today_relation.special_relation)
