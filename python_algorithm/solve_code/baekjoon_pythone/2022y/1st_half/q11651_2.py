import sys

num = int(sys.stdin.readline())

coordinate = []

for i in range(0, num):
    # x, y 에 정수가 아닌 문자열로 들어감 (틀린 이유)
    x, y = sys.stdin.readline().split()
    coordinate.append((y, x))

coordinate.sort()

for i in coordinate:
    print(i[0], i[1])
