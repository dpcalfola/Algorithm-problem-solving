from collections import deque

print(10 ** 2)

test_deque = deque([9, 7, 5])
test_list: list = [5]
# for _ in range(4):
#     print(test_deque.popleft())

print(test_deque[0])

if test_list.__contains__(test_deque[2]):
    print('contain')
else:
    print('No')

# 기차역의 범위 1 to 10**9
# 1 <= n <= 10**9
# 1 <= a, b <= 10**9

# n 개의 기차역: u1, u2, u3 ... un

# 가능성이 있다 기차는 방문한다 기차역을 한번 이상
# 아마도 u1, u2... 값을 복제한다

# k 개의 쿼리가 주어진다
# 쿼리는 포함한다 두개의 정수 a, b

# 매 쿼리는 결정한다 인지 아닌지 가능성이 있는지 여행할 가능성, 기차에 의해 , 기차역 a 부터 기차역 b 까지

# ex_
#   기차의 경로가 6개 역으로 구성되어 있다.
#   [3, 7, 1, 5, 1, 4]
#
#   3개의 쿼리
#       쿼리.1
#           a=3, b=5
#           가능성이 있다 여행할 가능성이 있다 기차역 3번에서 5번으로
#           경로는 구성된다 [3, 7, 1, 5]
#           답은 YSE
#       쿼리.2
#           a=1, b=7
#           1번에서 7번으로 갈수 없다, 기차는 반대방향으로 갈 수 없다
#           답은 NO
#       쿼리.3
#           a=3, b=10
#           3번에서 10번으로 갈 수 없다, 10번은 기차역 번호에 포함되지 않는다
#           답은 NO


index_test: list = [3, 5, 7, 6, 5, 1, 7, 9, 0]
print(index_test.index(7))
