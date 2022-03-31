import sys

arr = list(map(int, sys.stdin.readline().split()))
length = len(arr)
for i in range(0, length - 1):
    for j in range(0, length - 1 - i):
        if arr[j] > arr[j + 1]:
            arr[j], arr[j + 1] = arr[j + 1], arr[j]

print(*arr)
