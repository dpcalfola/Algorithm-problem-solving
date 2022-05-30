import sys

L = int(sys.stdin.readline().rstrip())
S = sys.stdin.readline().rstrip()

arr_s = list(S)
arr = []

# a 의 아스키코드 97
for i in arr_s:
    arr.append(ord(i) - 96)

sum_ = 0
for i in range(0, len(arr)):
    sum_ += arr[i] * (31 ** i)
    sum_ %= 1234567891

print(sum_)