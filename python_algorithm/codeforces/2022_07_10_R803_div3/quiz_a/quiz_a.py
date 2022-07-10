# 라운드 넘버 : 10의 k 제곱

# ex) 178
# -> 178 - 10**2 = 78

# 입력값이 10의 k 제곱 보다 크고 k+1보다 작은 k를 찾는다

import sys

t = int(sys.stdin.readline().rstrip())


def exec_case():
    m = int(sys.stdin.readline().rstrip())

    k = 1

    while True:
        if m < 10:
            print(m - 1)
            return
        if m < 10 ** k:
            answer = m - 10 ** (k - 1)
            print(answer)
            return
        else:
            k += 1


for _ in range(t):
    exec_case()
