import sys

num_of_student = int(sys.stdin.readline().rstrip())
score_list = []

for i in range(0, num_of_student):
    score_list.append(list(map(int, sys.stdin.readline().rstrip().split())))

top_score = -1
top_student = -1
top_index = -1
answer_list = []

# 배열을 score_list[][0] 기준으로 정렬
# 앞 번호 학생이 수상을 점유하고 있으면 동점이더라도 pass 하게 된다
score_list.sort(key=lambda x: x[0])

# 과목의 수는 4개 따라서 4번만 반복
# j ==> 학생
# j[0] == 학생id
# j[1~5] == 과목점수
# subject 를 i 로 하는 반복문
for i in range(1, 5):
    # 과목을 고정하고 학생 수만큼 student_num 을 돈다.
    for j in range(0, num_of_student):
        if top_score < score_list[j][i]:
            top_score = score_list[j][i]
            top_student = score_list[j][0]
            top_index = j

    # 수상하는 학생번호를 답 리스트에 append
    answer_list.append(top_student)

    # 수상하는 학생의 점수를 -1 로 교체
    for k in range(1, 5):
        score_list[top_index][k] = -1

    # 다음 과목으로 넘어가기 전에 top_score,top_student, top_index 를 초기화
    top_student = -1
    top_score = -1
    top_index = -1

# 정답 출력
for i in answer_list:
    print(i, end=" ")

# idea
# score_list[student_num][subject] subject 를 고정하고 student_num 을 비교한다
# 과목[1]을 돌려서 최대값일 경우 answer list 에 student_num[0](학생id) 값을 을 append 한다
# 뽑힌 학생의 모든 점수를 -1 으로 교체한다 :
