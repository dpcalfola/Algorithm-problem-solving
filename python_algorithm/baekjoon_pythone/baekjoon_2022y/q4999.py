import sys

jahwan = sys.stdin.readline().rstrip()
doctor = sys.stdin.readline().rstrip()

if len(jahwan) >= len(doctor):
    print('go')
else:
    print('no')
