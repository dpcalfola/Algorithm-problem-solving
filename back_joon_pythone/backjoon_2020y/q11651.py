import sys

num = int(sys.stdin.readline())

coordinate = []

for i in range(0, num):
    x, y = sys.stdin.readline().split()
    coordinate.append((int(x), int(y)))

coordinate.sort(key=lambda sort: (sort[1], sort[0]))

for i in coordinate:
    print(i[0], i[1])
