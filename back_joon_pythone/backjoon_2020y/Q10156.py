import sys

each_price, number, money = map(int, sys.stdin.readline().split())

if each_price * number < money:
    print(0)
else:
    print(each_price * number - money)
