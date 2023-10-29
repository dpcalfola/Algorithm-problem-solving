import math
import sys

max_int = 1000001


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
    left = 0
    right = num
    while True:
        if prime_list[left] and prime_list[right]:
            print(f"{num} = {left} + {right}")
            break
        else:
            right -= 1
            left += 1

        if left > right:
            print("Goldbach's conjecture is wrong.")
            return


primes = eratosthenes(max_int)

while True:
    n = int(sys.stdin.readline().rstrip())
    if not n:
        break
    goldbach(n, primes)
