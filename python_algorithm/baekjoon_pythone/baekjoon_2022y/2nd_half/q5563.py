import sys

total_price: int = int(sys.stdin.readline().rstrip())
readable_prices: list = []

for i in range(9):
    current_price: int = int(sys.stdin.readline().rstrip())
    readable_prices.append(current_price)

sum_readable_prices = sum(readable_prices)

erased_price = total_price - sum_readable_prices

print(erased_price)
