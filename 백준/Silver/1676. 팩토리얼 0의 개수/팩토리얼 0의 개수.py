n = int(input())

factorial = 1
count_2 = 0
count_5 = 0

for i in range(n, 0, -1):
    while i % 2 == 0 or i % 5 == 0:
        if i % 2 == 0:
            count_2 += 1
            i /= 2
        if i % 5 == 0:
            count_5 += 1
            i /= 5

if count_2 < count_5:
    print(count_2)
else:
    print(count_5)