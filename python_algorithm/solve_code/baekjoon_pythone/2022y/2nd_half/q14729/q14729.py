# 아이디어: 최대 힙

import sys
import heapq

N: int = int(sys.stdin.readline().rstrip())

lowest_seven = []

# 최초 7명을 최대힙에 푸시한다 (-1 을 곱해 최대힙 구현)
for _ in range(7):
    input_value: float = float(sys.stdin.readline().rstrip())
    heapq.heappush(lowest_seven, input_value * -1)

# 7명 이후의 학생 수만큼 반복
for _ in range(N - 7):
    # 최대힙이므로 index 0 이 최대값을 보장
    max_value = lowest_seven[0] * -1
    input_value: float = float(sys.stdin.readline().rstrip())

    # 만약 input_value가 하위 7명보다 낮다면
    # 그룹 최고점을 input_value 로 교체한다.
    if max_value > input_value:
        heapq.heapreplace(lowest_seven, input_value * -1)

# 입력이 모두 끝났을 때 7명의 (절대값)점수가 낮은 순서대로 정렬 (값은 모두 음수)
lowest_seven.sort(reverse=True)

# 순서대로 출력
for score in lowest_seven:
    print(f"{score * -1:.3f}")
