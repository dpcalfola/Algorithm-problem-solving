import sys

num = int(sys.stdin.readline())

people = []
registration_order = 0
for _ in range(0, num):
    age, name = sys.stdin.readline().split()
    people.append((registration_order, int(age), name))
    registration_order += 1

people.sort(key=lambda s: (s[1], s[0]))

for i in people:
    print(i[1], i[2])
