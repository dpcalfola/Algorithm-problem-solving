import sys

num = int(sys.stdin.readline().rstrip())

if num == 1:
    print(0)

else:
    arr = []

    # 다솜이 점수
    da = int(sys.stdin.readline().rstrip())

    # 나머지 점수
    for _ in range(num - 1):
        arr.append(int(sys.stdin.readline()))

    arr.sort(reverse=True)
    cnt = 0

    while da <= arr[0]:
        da += 1
        arr[0] -= 1
        arr.sort(reverse=True)
        cnt += 1

    print(cnt)
