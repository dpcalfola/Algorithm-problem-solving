import sys

list_size = int(sys.stdin.readline())
arr = list(map(int, sys.stdin.readline().split()))

# 합 배열
sum_arr = []
for i in range(0, len(arr)):
    if i == 0:
        sum_arr.append(arr[0])
    else:
        sum_arr.append(arr[i] + sum_arr[i - 1])

# 합 배열 제일 앞에 0 값 추가
sum_arr.insert(0, 0)

case = int(sys.stdin.readline())
answer_arr = []
for _ in range(0, case):
    s_a, s_b = sys.stdin.readline().split()

    # 구간 합 계산: (합 배열의 끝) - (합 배열의 시작)
    index_a = int(s_a) - 1
    index_b = int(s_b)
    answer_arr.append(sum_arr[index_b] - sum_arr[index_a])

# 정답 출력
for i in answer_arr:
    print(i)
