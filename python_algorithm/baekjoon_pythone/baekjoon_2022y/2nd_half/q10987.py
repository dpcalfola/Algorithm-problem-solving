import sys

target_word: str = sys.stdin.readline().rstrip()

vowel: set[str] = {'a', 'e', 'i', 'o', 'u'}
vowel_cnt: int = 0

for character in target_word:
    if character in vowel:
        vowel_cnt += 1

print(vowel_cnt)
