import math
import sys

max_int = 10001


# index = number
def eratosthenes(max_: int) -> list:
    arr = [True] * max_
    limit = math.floor(math.sqrt(max_))

    arr[0] = False
    arr[1] = False

    for i in range(2, limit):
        if arr[i]:
            for j in range(i * i, max_, i):
                arr[j] = False

    return arr


def goldbach(num: int, prime_list: list):
    mid = num // 2
    diff = num - mid
    while True:
        if prime_list[mid] and prime_list[diff]:
            print(diff, mid)
            break
        else:
            mid += 1
            diff -= 1


T = int(sys.stdin.readline())
primes = eratosthenes(max_int)

for _ in range(T):
    test_case = int(sys.stdin.readline().rstrip())
    goldbach(test_case, primes)
