from collections import deque

n, m, v = map(int, input().split())
graph = [[] for _ in range(n + 1)]

# for문을 이용하여 graph저장
for _ in range(m):
    n1, n2 = map(int, input().split())
    graph[n1].append(n2)
    graph[n2].append(n1)


# 재귀함수를 이용하여 dfs 구현
def dfs(v, visited=[]):
    visited.append(v)
    for w in graph[v]:
        if not w in visited:
            visited = dfs(w, visited)

    return visited


# depue와 visited리스트를 이용하여 bfs 구현
def bfs(v):
    visited = [v]
    deq = deque()
    deq.append(v)
    while deq: # deq가 없을때까지 반복
        v = deq.popleft() # deq에서 1개씩 꺼내옴
        for w in graph[v]:
            if w not in visited:
                visited.append(w)
                deq.append(w)
    return visited


for edge in graph: # graph상에 작은순부터 돌리기 위해서 정렬
    edge.sort()

for node in dfs(v):
    print(node, end=" ")

print()

for node in bfs(v):
    print(node, end=" ")
