import sys


def swap(arr, a, b):
    temp = arr[a]
    arr[a] = arr[b]
    arr[b] = temp
    return arr


def bubble_sort_reverse(arr):
    length = len(arr)
    for i in range(0, length - 1):
        for j in range(0, length - 1 - i):
            if arr[j] < arr[j + 1]:
                swap(arr, j, j + 1)


w_list = []
k_list = []

for _ in range(10):
    score = int(sys.stdin.readline().rstrip())
    w_list.append(score)

for _ in range(10):
    score = int(sys.stdin.readline().rstrip())
    k_list.append(score)

bubble_sort_reverse(w_list)
bubble_sort_reverse(k_list)

w_score = 0
k_score = 0

for i in range(0, 3):
    w_score += w_list[i]
    k_score += k_list[i]

print(w_score, k_score)

