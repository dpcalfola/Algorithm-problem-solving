import math
import sys

D, H, W = map(int, sys.stdin.readline().split())

print(D, H, W)

k_pow2 = D**2 / (H**2 + W**2)
real_h = math.sqrt(D**2 / k_pow2) - W**2
print(real_h)

# d**2 == (Hk)**2 + (Wk)**2
# real_h**2 == (D**2 / k_pow2) - W**2
