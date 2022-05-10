import sys
# 파이썬은 반복횟수가 1000이 넘으면 recursion Error가 발생하므로
# 반복횟수의 제한을 키워준다.
sys.setrecursionlimit(10**6)

n, m = map(int, sys.stdin.readline().split())
graph = [[] for _ in range(n + 1)]
visited = []
count = 0
tmp = []
nodes = list(range(1, n + 1)) # 노드의 전체 저장

# 그래프 정의
for _ in range(m):
    u, v = map(int, sys.stdin.readline().split())
    graph[u].append(v)
    graph[v].append(u)


# dfs 리커젼 함수
def dfs(v, visited):
    if not v in visited:  # visited에 없을 경우만 추가
        visited.append(v)
    for w in graph[v]:
        if not w in visited:
            visited = dfs(w, visited)

    return visited


# 반복문 돌면서 실행
while set(visited) != set(nodes): # visited가 nodes와 동일할때까지 반복
    # nodes - visoited 중 작은값으로 visited 실행
    visited = dfs(min([x for x in nodes if x not in visited]), visited)
    if visited != tmp:  # visited에 변화 있으면 count += 1
        count += 1
    tmp = visited.copy()  # = 은 객체가 동일화 되므로 copy필요

print(count)