import sys
from collections import deque


# 글자가 없어질떄까지 반복
# 제일 앞 원소를 pop 해서 new list 에 넣는다
# 다음 글자가 같을 경우 continue
# 다음 글자가 같지 않을 경우 pop 한 글자가 new list에 존재한다면 False

def is_group_word(s: str) -> bool:
    s_que = deque(list(s))
    new_list = []

    while s_que:
        current = s_que.popleft()
        if current not in new_list:
            new_list.append(current)
        elif current == new_list[-1]:
            continue
        else:
            return False

    return True


N = int(sys.stdin.readline().rstrip())
cnt = 0

for _ in range(N):
    input_str = sys.stdin.readline().rstrip()
    # print('str: ', input_str, is_group_word(input_str))
    if is_group_word(input_str):
        cnt += 1

print(cnt)
