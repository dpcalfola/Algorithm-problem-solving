# Get Three angles into list
#   If the sum of angles is not 180, print 'Error'
#   And return
# Make set from angle list
#   If the size of set is
#       1) 1 means Equilateral
#       2) 2 means Isosceles
#       3) 3 means Scalene

import sys

angles = []

# input_a = int(sys.stdin.readline().rstrip())
# print(input_a)
# input_b = int(sys.stdin.readline().rstrip())
# print(input_b)
# input_c = int(sys.stdin.readline().rstrip())
#
# angles.append(input_a)
# angles.append(input_b)
# angles.append(input_c)


for _ in range(3):
    input_number = int(sys.stdin.readline().rstrip())
    angles.append(input_number)


def figure_out_triangle(a_list: list) -> str:
    sum_of_angles = sum(a_list)

    if sum_of_angles != 180:
        return 'Error'

    set_of_angles = set(a_list)
    size_of_set: int = len(set_of_angles)

    if size_of_set == 1:
        return 'Equilateral'
    if size_of_set == 2:
        return 'Isosceles'
    if size_of_set == 3:
        return 'Scalene'


print(figure_out_triangle(angles))
