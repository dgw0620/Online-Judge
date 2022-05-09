import sys

n = int(sys.stdin.readline())
nList = [0 for _ in range(10001)]

for _ in range(n):
    tmp = int(sys.stdin.readline())
    nList[tmp] += 1

for i in range(1, 10001):
    for _ in range(nList[i]):
        print(i)
