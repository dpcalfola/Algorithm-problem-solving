import collections
import sys

N = int(sys.stdin.readline().rstrip())
s_list = list(map(int, sys.stdin.readline().split()))
M = int(sys.stdin.readline().rstrip())
m_list = list(map(int, sys.stdin.readline().split()))

s_dic = collections.Counter(s_list)

for i in m_list:
    try:
        print(s_dic[i], end=" ")
    except KeyError:
        print(0, end=" ")
