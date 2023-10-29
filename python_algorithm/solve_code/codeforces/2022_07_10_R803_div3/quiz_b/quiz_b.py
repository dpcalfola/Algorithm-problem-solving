# 하루에 3개를 넘지 않는 글자를 기억할 수 있다

# non-empty string s를 기록하길 원한다
# s가 뭐냐면 구성되어있다 소문자로 가장 작은 숫자 of days

# 얼마나 많은 날짜 안에 할 수 있는가

# P는 empty sting 으로 초기화, 오직 sting의 마지막에 글자를 추가 할 수 있다

# ex_) lollipops -> 2일
# 첫날 l, o, i 를 기억하여 lolli를 만든다
# 둘째날 p, o, s 를 만들어 pops를 만들고
# 둘째날까지 기억한 모든 글자를 활용하여 lollipops 단어를 완성 할 수 있다 -> 최소 날자 2일


import sys
from collections import deque

t = int(sys.stdin.readline().rstrip())


def one_day_process(s_deque: deque, end_flag: bool) -> (deque, bool):
    memory: list = []

    while True:
        # If deque is empty, return
        try:
            if len(memory) < 3:
                current = s_deque.popleft()
                if not memory.__contains__(current):
                    memory.append(current)

            if memory.__contains__(s_deque[0]):
                s_deque.popleft()
            elif len(memory) == 3:
                # test code start
                print("deque: ", s_deque)
                print("memory: ", memory)
                # test code end

                return s_deque, end_flag

        except IndexError:
            end_flag = True
            return s_deque, end_flag


def exec_case():
    s_list: list = list(sys.stdin.readline().rstrip())
    s_deque = deque(s_list)

    days_cnt: int = 0

    end_flag: bool = False

    while True:
        days_cnt += 1

        # One day process
        (return_deque, return_flag) = one_day_process(s_deque, end_flag)

        s_deque = return_deque
        end_flag = return_flag

        if end_flag:
            print(days_cnt)
            return


for _ in range(t):
    exec_case()
