"""
https://www.acmicpc.net/problem/10813
"""
import sys

# n => The number of baskets
# m => The number of execute cases
n: int
m: int
n, m = map(int, sys.stdin.readline().rstrip().split())


class Baskets:
    def __init__(self, num_of_baskets):
        self.num_of_baskets = num_of_baskets
        self._basket_data = [_i + 1 for _i in range(self.num_of_baskets)]

    def swap_ball(self, b_1, b_2):
        b_1_value: int = self._basket_data[b_1]
        b_2_value: int = self._basket_data[b_2]
        self._basket_data[b_1] = b_2_value
        self._basket_data[b_2] = b_1_value

    def print_baskets(self):
        print(*self._basket_data)


basket = Baskets(n)

for _ in range(m):
    i: int
    j: int
    i, j = map(int, sys.stdin.readline().rstrip().split())
    # Swap, But i and j need to -1 for using as index
    basket.swap_ball(b_1=i - 1, b_2=j - 1)

# Print answer
basket.print_baskets()
