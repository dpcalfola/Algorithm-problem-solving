"""
https://www.acmicpc.net/problem/10810
"""
import sys

# GET-INPUT
# Get n and m
n: int
m: int
n, m = map(int, sys.stdin.readline().rstrip().split(" "))

# Get the cases and append to case_list (repeat "m" times)
case_list: list[list[int]] = []
for i in range(m):
    case: list[int] = list(map(int, sys.stdin.readline().rstrip().split(" ")))
    case_list.append(case)


class Baskets:
    def __init__(self, num_of_baskets: int):
        self.num_of_basket = num_of_baskets
        self.basket_data: list = [0 for _ in range(self.num_of_basket)]

        # Fields that used for exec_case()
        self.ball_number = None
        self.end_basket = None
        self.start_basket = None

    def exec_case(self, each_case: list):
        # Get case data (basket index start from 0)
        self.start_basket: int = each_case[0] - 1
        self.end_basket: int = each_case[1] - 1
        self.ball_number: int = each_case[2]

        # Replace the ball from start to end
        for i in range(self.start_basket, self.end_basket + 1):
            self.basket_data[i] = self.ball_number

    def __repr__(self):
        return str(self.basket_data)


# Solving function
def solve(num_of_baskets: int, cass_list: list[list[int]]) -> Baskets:
    baskets = Baskets(num_of_baskets=num_of_baskets)

    # Execute cases
    for each_case in cass_list:
        baskets.exec_case(each_case=each_case)

    # Return result
    return baskets


# Sample Test
def test_sample():
    test_n = 5
    test_case_list: list = [[1, 2, 3], [3, 4, 4], [1, 4, 1], [2, 2, 2]]
    test_solved_data: list = solve(
        num_of_baskets=test_n, cass_list=test_case_list
    ).basket_data
    test_answer: str = " ".join(str(x) for x in test_solved_data).rstrip()
    expected = "1 2 1 1 0"
    assertion_error_message: str = f"Error: Sample test failed \n\ttest_answer: {test_answer} \n\texpected: {expected}"
    assert test_answer == expected, assertion_error_message


# MAIN CODE

# Do test sample
test_sample()

# Print Answer
result: Baskets = solve(num_of_baskets=n, cass_list=case_list)
print(*result.basket_data)
