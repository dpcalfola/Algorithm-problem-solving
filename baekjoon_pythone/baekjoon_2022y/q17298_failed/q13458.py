import math
import sys

# Get input
N = int(sys.stdin.readline().rstrip())
list_a = list(map(int, sys.stdin.readline().split()))

# p_capacity == Primary watcher capacity
# s_capacity == Secondary watcher capacity
p_capacity, s_capacity = list(map(int, sys.stdin.readline().split()))

# Declare total_watcher counter
total = 0

# Every a_room should to have p_watcher
total += len(list_a)

# Subtract p_capacity from the number student in every room_a
list_a = [i - p_capacity for i in list_a]

# If (a_capacity - p_watcher) is negative integer, make it 0
for i in range(len(list_a)):
    if list_a[i] < 0:
        list_a[i] = 0

# Figure out needed s_watcher number for every a_room
for i in list_a:
    if i == 0:
        continue
    room_watcher = math.ceil(i / s_capacity)
    total += room_watcher

# print answer
print(total)
