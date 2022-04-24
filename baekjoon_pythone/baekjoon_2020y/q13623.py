import collections
import sys

arr = list(map(int, sys.stdin.readline().split()))

dic_cnt = collections.Counter(arr)

if dic_cnt[0] == 1:
    winner = arr.index(0)
    print(chr(winner + 65))
elif dic_cnt[0] == 2:
    winner = arr.index(1)
    print(chr(winner + 65))
else:
    print('*')
