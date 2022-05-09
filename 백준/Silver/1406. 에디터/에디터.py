from sys import stdin

left = list(stdin.readline())
left.pop()
right = []

for _ in range(int(input())):
    command = stdin.readline().split()
    if command[0] == "L":
        if left:
            right.append(left.pop())
    elif command[0] == "D":
        if right:
            left.append(right.pop())
    elif command[0] == "B":
        if left:
            left.pop()
    elif command[0] == "P":
        left.append(command[1])

right.reverse()
print(''.join(left + right))
