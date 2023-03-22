from math import prod

n = [int(input()) for i in range(3)]

n = list(str(prod(n)))

for i in range(10):
    print(n.count(str(i)))