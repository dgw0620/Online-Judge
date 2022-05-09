from sys import stdin

n = int(input())
stack = []
count = 0
result = ""

for _ in range(n):
    number = int(stdin.readline())
    while number > count:
        count += 1
        stack.append(count)
        result += "+\n"
    if stack[-1] == number:
        stack.pop()
        result += "-\n"
    else:
        print("NO")
        exit(0)
print(result)
