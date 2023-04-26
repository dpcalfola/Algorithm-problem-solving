"""
https://www.acmicpc.net/problem/1453
"""
import sys

_ = sys.stdin.readline().rstrip()
customers: list[int] = list(map(int, sys.stdin.readline().rstrip().split(" ")))

set_customers = set(customers)

customers_length: int = len(customers)
set_customers_length: int = len(set_customers)

differential: int = customers_length - set_customers_length

print(differential)
