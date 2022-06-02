import sys

num = int(sys.stdin.readline())

list_a = list(map(int, sys.stdin.readline().split()))
list_b = list(map(int, sys.stdin.readline().split()))

list_a.sort()
list_b.sort(reverse=True)

sum_of = 0

for i in range(num):
    sum_of += list_a[i] * list_b[i]

print(sum_of)
