import sys

n = int(sys.stdin.readline())

pList = list(map(int, sys.stdin.readline().split()))

dp = [0 for _ in range(n + 1)]

dp[1] = pList[0]

for i in range(1, n + 1):
    for j in range(1, i):
        if dp[i] != 0:
            dp[i] = min(dp[i], pList[i - 1], dp[i - j] + pList[j - 1])
        else:
            dp[i] = min(pList[i - 1], dp[i - j] + pList[j - 1])

print(dp[n])