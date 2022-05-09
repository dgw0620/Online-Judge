import sys


num = int(input())
stack = list()

for i in range(num):
    command = sys.stdin.readline()
    if "push" in command:
        n = int(command.split()[1])
        stack.append(n)
    elif "pop" in command:
        if len(stack) == 0:
            print(-1)
        else:
            tmp = int(stack[len(stack) - 1])
            print(tmp)
            del stack[len(stack) - 1]
    elif "size" in command:
        print(len(stack))
    elif "empty" in command:
        if len(stack) == 0:
            print(1)
        else:
            print(0)
    elif "top" in command:
        if len(stack) == 0:
            print(-1)
        else:
            print(stack[len(stack) - 1])