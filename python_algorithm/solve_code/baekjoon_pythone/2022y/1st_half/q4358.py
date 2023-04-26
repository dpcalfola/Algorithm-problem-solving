import sys
from collections import defaultdict

trees_dict = defaultdict(int)
n = 0
while True:
    tree = sys.stdin.readline().rstrip()
    if not tree:
        break
    trees_dict[tree] += 1
    n += 1

tree_sorted_list = sorted(trees_dict.items())

for i in tree_sorted_list:
    print("%s %.4f" % (i[0], i[1] / n * 100))
