# 백준 14499

import sys


class Dice:
    value = [0, 0, 0, 0, 0, 0]

    def move_east(self):
        new_value = [
            self.value[3],
            self.value[1],
            self.value[0],
            self.value[5],
            self.value[4],
            self.value[2]
        ]
        self.value = new_value

    def move_west(self):
        new_value = [
            self.value[2],
            self.value[1],
            self.value[5],
            self.value[0],
            self.value[4],
            self.value[3]
        ]
        self.value = new_value

    def move_south(self):
        new_value = [
            self.value[4],
            self.value[0],
            self.value[2],
            self.value[3],
            self.value[5],
            self.value[1]

        ]
        self.value = new_value

    def move_north(self):
        new_value = [
            self.value[1],
            self.value[5],
            self.value[2],
            self.value[3],
            self.value[0],
            self.value[4]
        ]
        self.value = new_value

    def get_bottom_side(self):
        return self.value[5]

    def set_bottom_side(self, number):
        self.value[5] = number

    def get_top_side(self):
        return self.value[0]

    def __str__(self):
        dice_value = ''
        for i in self.value:
            dice_value += str(i)
        return dice_value


# Dice Move
# original = [1, 2, 3, 4, 5, 6]
# east = [4, 2, 1, 6, 5, 3]
# west = [3, 2, 6, 1, 5, 4]
# south = [5, 1, 3, 4, 6, 2]
# north = [2, 6, 3, 4, 1, 5]


input_line = list(map(int, sys.stdin.readline().split()))
n, m = input_line[0], input_line[1]
position = [input_line[2], input_line[3]]
number_of_order = input_line[4]

map_ = []
dice = Dice()

for _ in range(n):
    map_input = list(map(int, sys.stdin.readline().split()))
    map_.append(map_input)

orders = list(map(int, sys.stdin.readline().split()))


# If the position out of the map, this function returns -1
def get_number(read_position: [int, int]) -> int:
    read_x = read_position[0]  # x: vertical
    read_y = read_position[1]  # y: hrizontal
    try:
        result_axis = map_[read_x][read_y]
    except IndexError:
        result_axis = -1
    return result_axis


def set_number(set_position: [int, int], set_value):
    set_x = set_position[0]
    set_y = set_position[1]
    map_[set_x][set_y] = set_value


# 만약 지도 밖으로 나간다면 False 를 리턴
def order_execute() -> bool:
    map_number = get_number(position)

    if position[0] < 0 or position[1] < 0:
        return False
    if map_number == -1:
        return False

    if map_number == 0:
        set_number(position, dice.get_bottom_side())
    else:
        dice.set_bottom_side(get_number(position))
        set_number(position, 0)

    print(dice.get_top_side())
    return True


# 주사위를 일단 움직인다
# 움직인 이후 타당성 검사
# 지도 밖으로 나갔을 경우
#   1. 위치를 직전으로 돌린다
#   2. 주사위를 반대 방향으로 돌림


# START !!
for order in orders:
    if order == 1:
        position[1] += 1
        dice.move_east()
        if not order_execute():
            position[1] -= 1
            dice.move_west()

    if order == 2:
        position[1] -= 1
        dice.move_west()
        if not order_execute():
            position[1] += 1
            dice.move_east()

    if order == 3:
        position[0] -= 1
        dice.move_north()
        if not order_execute():
            position[0] += 1
            dice.move_south()

    if order == 4:
        position[0] += 1
        dice.move_south()
        if not order_execute():
            position[0] -= 1
            dice.move_north()
