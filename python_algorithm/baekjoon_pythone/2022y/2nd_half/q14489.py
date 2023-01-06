import sys

amount_of_bank_account: int = sum(map(int, sys.stdin.readline().split()))
double_chicken_price: int = int(sys.stdin.readline().rstrip()) * 2

if amount_of_bank_account >= double_chicken_price:
    print(amount_of_bank_account - double_chicken_price)
else:
    print(amount_of_bank_account)
