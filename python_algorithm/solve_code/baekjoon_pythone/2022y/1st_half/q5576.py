import sys

w_list = []
k_list = []
w_score = 0
k_score = 0

for _ in range(10):
    w_list.append(int(sys.stdin.readline().rstrip()))
for _ in range(10):
    k_list.append(int(sys.stdin.readline().rstrip()))

w_list.sort(reverse=True)
k_list.sort(reverse=True)

for i in range(0, 3):
    w_score += w_list[i]
    k_score += k_list[i]

print(w_score, k_score)
