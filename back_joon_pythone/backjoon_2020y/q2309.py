import random
import sys

dwf_list = []
for _ in range(0, 9):
    dwf_list.append(int(sys.stdin.readline()))

while True:
    selected_dwf = random.sample(dwf_list, 7)
    if sum(selected_dwf) == 100:
        break

selected_dwf.sort()

for i in selected_dwf:
    print(i)
