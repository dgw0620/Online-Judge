from sys import stdin

nList = list(map(int, input().split()))
result = 0

for num in nList:
    result += num ** 2

print(result % 10)