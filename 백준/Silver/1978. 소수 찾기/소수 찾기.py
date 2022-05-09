n = int(input())
numbers = map(int, input().split())

primeCount = 0


for num in numbers:
    count = 0
    for i in range(1, num + 1):
        if num % i == 0:
            count += 1
    if count == 2:
        primeCount += 1

print(primeCount)