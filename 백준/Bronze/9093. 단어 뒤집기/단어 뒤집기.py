import sys

n = int(input())

for i in range(n):
    text = sys.stdin.readline()
    result = ""
    for tmp in text.split():
        result += ''.join(reversed(tmp))
        result += ' '
    print(result)