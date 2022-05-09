import sys

n = int(input())

for i in range(n):
    text = sys.stdin.readline()
    count = 0
    for tmp in list(text):
        if "(" in tmp:
            count += 1
        elif ")" in tmp:
            count -= 1
        if count < 0:
            break
    if count == 0:
        print('YES')
    elif count != 0:
        print('NO')