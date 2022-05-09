primeListCk = [True] * 1000001

for i in range(2, int(1000001 ** 0.5) + 1):
    if primeListCk[i]:
        for j in range(i + i, 1000001, i):
            primeListCk[j] = False

while 1:
    n = int(input())
    check = False

    if n == 0:
        break
    a = 3
    b = n - 3

    while a <= b:
        if n - a == b and primeListCk[a] and primeListCk[b]:
            print("{} = {} + {}".format(n, a, b))
            check = True
            break
        a += 1
        b -= 1

    if check == False:
        print("Goldbach's conjecture is wrong.")
