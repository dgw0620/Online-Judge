import sys


num = int(input())
queue = list()

for i in range(num):
    command = sys.stdin.readline() # 명령 읽기
    if "push" in command:
        n = int(command.split()[1])
        queue.append(n)
    elif "pop" in command:
        if len(queue) == 0:
            print(-1)
        else:
            tmp = int(queue[0])
            print(tmp)
            del queue[0]
    elif "size" in command:
        print(len(queue))
    elif "empty" in command:
        if len(queue) == 0:
            print(1)
        else:
            print(0)
    elif "back" in command:
        if len(queue) == 0:
            print(-1)
        else:
            print(queue[len(queue) - 1])
    elif "front" in command:
        if len(queue) == 0:
            print(-1)
        else:
            print(queue[0])