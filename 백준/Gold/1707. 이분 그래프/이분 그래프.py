import sys
from collections import deque

sys.setrecursionlimit(10 ** 6)  # 반복제한 횟수 늘리기
input = sys.stdin.readline  # input을 sys.stdin.readline으로 받기

def dfs(v):
    global ErrorCk
    for w in graph[v]:
        if visited[v] == visited[w]:
            ErrorCk = True
            return
        if visited[w] == -1:
            if visited[v] == 'r':
                visited[w] = 'b'
            else:
                visited[w] = 'r'
            dfs(w)
    return


k = int(input())

for _ in range(k):  # k개의 케이스 존재
    v, e = map(int, input().split())
    graph = [[] for _ in range(v + 1)]
    visited = [-1] * (v + 1)
    ErrorCk = False

    for _ in range(e):  # graph에 입력
        n1, n2 = map(int, input().split())
        graph[n1].append(n2)
        graph[n2].append(n1)

    for i in range(1, v + 1): # 차례로 실행
        if visited[i] == -1:
            visited[i] = 'r'
            dfs(i)
        if ErrorCk:
            break

    print('NO' if ErrorCk else 'YES')