# N : 학생 총 인원
# K : 한 방에 배정 가능한 최대 인원 수
import sys
from collections import defaultdict, Counter

N, K = map(int, sys.stdin.readline().split())

students: list = []
room_cnt = 0

for _ in range(N):
    # gender == 0 -> Female
    # gender == 1 -> Male
    gender, grade = map(int, sys.stdin.readline().split())
    students.append((gender, grade))

students_counter_dic = Counter(students)

for key, value in students_counter_dic.items():
    # 방 수용 인원 최대치 딱 떨어짐
    if value // K == value / K:
        room_needs = value // K
    # 추가 방 필요
    else:
        room_needs = value // K + 1

    room_cnt += room_needs

print(room_cnt)
