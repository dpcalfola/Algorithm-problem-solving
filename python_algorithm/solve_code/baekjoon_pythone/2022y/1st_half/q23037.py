import sys

n: str = sys.stdin.readline().rstrip()
n_list: list = list(map(int, n))

answer = 0

for i in n_list:
    answer += i**5

print(answer)
