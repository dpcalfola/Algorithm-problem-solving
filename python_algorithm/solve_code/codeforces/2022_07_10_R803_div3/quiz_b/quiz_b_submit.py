import sys
from collections import deque

t = int(sys.stdin.readline().rstrip())


def one_day_process(s_deque: deque, end_flag: bool) -> (deque, bool):
    memory: list = []

    while True:
        # try-catch : If deque is empty, return
        try:
            if len(memory) < 3:
                current = s_deque.popleft()
                if not memory.__contains__(current):
                    memory.append(current)

            if memory.__contains__(s_deque[0]):
                s_deque.popleft()
            elif len(memory) == 3:
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
