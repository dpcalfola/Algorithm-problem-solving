# 백준 q10825

import sys


class Student:
    def __init__(self, name, native_lang, english, math):
        self.name = name
        self.native_lang = native_lang
        self.english = english
        self.math = math

    def __repr__(self):
        return repr((self.name, self.native_lang, self.english, self.math))


num = int(sys.stdin.readline())
students = []

for _ in range(num):
    input_list = list(map(str, sys.stdin.readline().split()))
    stu_1 = Student(input_list[0], int(input_list[1]), int(input_list[2]), int(input_list[3]))
    students.append(stu_1)

students.sort(key=lambda x: (-x.native_lang, x.english, -x.math, x.name))

for i in students:
    print(i.name)
