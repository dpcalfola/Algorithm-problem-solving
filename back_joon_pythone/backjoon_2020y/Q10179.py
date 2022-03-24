import sys

test_case = int(sys.stdin.readline())


def discounted_price(price):
    return price * 0.8


for _ in range(test_case):
    discounted_price_ = discounted_price(float(sys.stdin.readline()))
    result = "${:.2f}".format(discounted_price_)
    print(result)
