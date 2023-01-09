import sys

arr = []
for _ in range(5):
    input_num: int = int(sys.stdin.readline().rstrip())
    arr.append(input_num)

arr.sort()

avg = sum(arr) // 5
mid_value = arr[2]

print(avg)
print(mid_value)
