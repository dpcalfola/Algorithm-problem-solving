import sys

input_str = sys.stdin.readline().rstrip()
input_list = input_str.split("/")
# print(input_list)

# type assume... how uncomfortable...
K = int(input_list[0])
D = int(input_list[1])
A = int(input_list[2])

# print(K + A)
# print(D)

if (K + A) < D or D == 0:
    print('hasu')
else:
    print('gosu')
