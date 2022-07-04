import sys


# 배열의 결과가 True -> 소수
# 배열의 index -> 숫자
def prime_arr(max_int: int, target_counter: int) -> int:
    counter = 0

    # boolean 배열 생성
    arr = [True] * (max_int + 1)

    # 0 과 1 은 소수가 아님으로 마킹
    arr[0] = False
    arr[1] = False

    for i in range(2, max_int + 1):
        # i가 소수일 경우
        if arr[i]:
            # counter++
            counter += 1

            # 타겟 체크
            if counter == target_counter:
                return i

            # 소수의 제곱부터 최대범위까지 i의 배수만큼 걸어가며 False 로 마킹
            for j in range(i * i, len(arr), i):

                # 지워지지 않았을 경우에만 지우고 카운트
                if arr[j]:
                    arr[j] = False
                    # counter++
                    counter += 1

                # 타겟 체크
                if counter == target_counter:
                    return j


N, K = sys.stdin.readline().split()

print(prime_arr(int(N), int(K)))
