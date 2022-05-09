a, b = map(int, input().split())

if a > b:
    x, y = a, b
else:
    x, y = b, a
z = -1

while z != 0 :
    z = x % y
    x, y = y, z

print(x)
print(int(a * b / x))