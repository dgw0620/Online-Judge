from sys import stdin

n = int(input())

numbers = list(map(int, stdin.readline().split()))
maxNum = max(numbers)

for i in range(len(numbers)):
    numbers[i] = numbers[i] / maxNum * 100

print(sum(numbers)/len(numbers))