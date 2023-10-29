import sys

n = int(sys.stdin.readline().rstrip())
cute_cnt = 0
not_cute_cnt = 0

for _ in range(n):
    input_ = sys.stdin.readline().rstrip()
    if input_ == "1":
        cute_cnt += 1
    else:
        not_cute_cnt += 1

print("Junhee is cute!") if cute_cnt > not_cute_cnt else print("Junhee is not cute!")
