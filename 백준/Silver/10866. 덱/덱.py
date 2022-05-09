import sys


num = int(input())
deque = list()

for i in range(num):
    command = sys.stdin.readline() # 명령 읽기
    if "push_front" in command:
        n = int(command.split()[1])
        deque.insert(0,n)
    elif "push_back" in command:
        n = int(command.split()[1])
        deque.append(n)
    elif "pop_front" in command:
        if len(deque) == 0:
            print(-1)
        else:
            tmp = int(deque[0])
            print(tmp)
            del deque[0]
    elif "pop_back" in command:
        if len(deque) == 0:
            print(-1)
        else:
            tmp = int(deque[-1])
            print(tmp)
            del deque[-1]
    elif "size" in command:
        print(len(deque))
    elif "empty" in command:
        if len(deque) == 0:
            print(1)
        else:
            print(0)
    elif "back" in command:
        if len(deque) == 0:
            print(-1)
        else:
            print(deque[-1])
    elif "front" in command:
        if len(deque) == 0:
            print(-1)
        else:
            print(deque[0])