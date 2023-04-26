import sys

arr = list(sys.stdin.readline().rstrip())

for i in range(len(arr) - 1):
    if arr[i] == arr[i + 1]:
        arr[i] = -1

nums_0 = arr.count("0")
nums_1 = arr.count("1")

minimum = min(nums_0, nums_1)
print(minimum)
