import sys

n, x = map(int, input().split())

nList = list(map(int, sys.stdin.readline().split()))
tmp = list(filter(lambda num: num < x, nList))
tmp1 = list(map(str, tmp))
print(" ".join(tmp1))