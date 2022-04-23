import sys

t = int(sys.stdin.readline().rstrip())


def execute(li: list, p: int, c: int):
    days = 0
    while True:
        sum_ = 0
        check = str(c)[:]
        for i in li:
            sum_ += i + days
            if sum_ > p:
                break
            else:
                c += 1
        if check == str(c):
            print(c)
            return
        days += 1


for _ in range(t):
    n, x = map(int, sys.stdin.readline().split())
    input_list = list(map(int, sys.stdin.readline().split()))
    input_list.sort()
    count = 0
    execute(input_list, x, count)
