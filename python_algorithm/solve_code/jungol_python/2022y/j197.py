import sys


class Square:
    def __init__(self, x, y, x_1, y_1):
        self.x = int(x)
        self.y = int(y)
        self.x_1 = int(x_1)
        self.y_1 = int(y_1)

    def __repr__(self):
        return self.x, self.y, self.x_1, self.y_1

    def area(self):
        return abs(self.x - self.x_1) * abs(self.y - self.y_1)

    def print_coordinate(self):
        print(self.x, self.y, self.x_1, self.y_1)


line_1 = list(map(int, sys.stdin.readline().split()))
line_2 = list(map(int, sys.stdin.readline().split()))

square_1 = Square(line_1[0], line_1[1], line_1[2], line_1[3])
square_2 = Square(line_2[0], line_2[1], line_2[2], line_2[3])

max_x = min(square_1.x, square_2.x)
max_y = min(square_1.y, square_2.y)
max_x_1 = max(square_1.x_1, square_2.x_1)
max_y_1 = max(square_1.y_1, square_2.y_1)

square_max = Square(max_x, max_y, max_x_1, max_y_1)

square_max.print_coordinate()
