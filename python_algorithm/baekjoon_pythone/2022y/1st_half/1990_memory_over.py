# q1990
# Find prime numbers in range (Eratosthenes)
# Check prime element is Palindrome or not
import math
import sys


def eratosthenes(max_int: int) -> list:
    arr = [True] * (max_int + 1)
    limit = math.floor(math.sqrt(max_int))

    arr[0] = False
    arr[1] = False

    for i in range(2, limit):
        if arr[i]:
            for j in range((i ** 2), len(arr), i):
                arr[j] = False

    return arr


def is_palindrome(integer: int) -> bool:
    int_list = list(str(integer))
    while len(int_list) > 1:
        if int_list.pop(0) != int_list.pop():
            return False

    return True


input_line = list(map(int, sys.stdin.readline().split()))
min_range = input_line[0]
max_range = input_line[1]
# print(min_range, max_range)

prime_list = eratosthenes(max_range)

for i in range(min_range, max_range + 1):
    if prime_list[i]:
        if is_palindrome(i):
            print(i)

print(-1)
