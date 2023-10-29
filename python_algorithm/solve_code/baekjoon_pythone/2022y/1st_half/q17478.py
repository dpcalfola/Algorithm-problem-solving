import sys

N = int(sys.stdin.readline().rstrip())

print("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.")


#
# Question paragraph part


# Question snippet
def print_paragraph(p: str):
    print(p + '"재귀함수가 뭔가요?"')
    print(p + '"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.')
    print(p + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.")
    print(p + '그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어."')


# Repeat Question snippets
for i in range(N):
    question_prefix: str = "____" * i
    print_paragraph(question_prefix)

#
# Answer paragraph part
# Print final question and the answer the meaning of recursive function eventually
answer_prefix = "____" * N
print(answer_prefix + '"재귀함수가 뭔가요?"')
print(answer_prefix + '"재귀함수는 자기 자신을 호출하는 함수라네"')

#
# Escape paragraph part
for i in range(N, -1, -1):
    escape_prefix = "____" * i
    print(escape_prefix + "라고 답변하였지.")
