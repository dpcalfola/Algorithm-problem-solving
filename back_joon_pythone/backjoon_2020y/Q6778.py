import sys

num_of_antenna = int(sys.stdin.readline())
num_of_eyes = int(sys.stdin.readline())

if num_of_antenna >= 3 and num_of_eyes <= 4:
    print("TroyMartian")

if num_of_antenna <= 6 and num_of_eyes >= 2:
    print("VladSaturnian")

if num_of_antenna <= 2 and num_of_eyes <= 3:
    print("GraemeMercurian")
