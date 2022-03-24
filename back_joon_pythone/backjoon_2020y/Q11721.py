import sys

input_string = sys.stdin.readline()
# input_string = "OneTwoThreeFourFiveSixSevenEightNineTen"

s = input_string

while len(s) > 10:
    print(s.removesuffix(s[10:]))  # 문자열 인덱스 10 이후를 접미사로 잡고 접미사를 자른 결과값을 출력
    s = s.removeprefix(s[:10])  # 전체 문자열에서 인덱스 10 이전을 접두사로 잡고 접두사를 자른 나머지를 전체 문자열로 반환
    # 이후 전체 문자열의 길이가 10 이하가 될 때까지 반복

print(s)  # 남은 문자열(길이가 10 이하) 를 출력하고 마무리
