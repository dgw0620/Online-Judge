n = int(input())

for i in range(n):
    a = int(i)
    num = list()

    while a >= 1:
        num.append(int(a % 10))
        a /= 10

    if i + sum(num) == n:
        print(i)
        break

if i == n - 1:
    print(0)