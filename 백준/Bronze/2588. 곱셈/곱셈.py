a = int(input())
b = int(input())

c = b % 10
print(a * c)
c = (b // 10) % 10
print(a * c)
c = (b // 100) % 10
print(a * c)
print(a * b)
