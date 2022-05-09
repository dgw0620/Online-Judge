def dfs(v, visited):
    visited.append(v)
    if len(visited) >= 5: # 노드의 깊이가 5 이상이면 True
        return True
    for w in graph[v]:
        if not w in visited:
            if dfs(w, visited):
                return True
    visited.pop()
    return False

n, m = map(int, input().split())
graph = [[] for i in range(n)]

# graph에 노드간 엣지 저장하기
for i in range(m):
    n1, n2 = map(int, input().split())
    graph[n1].append(n2)
    graph[n2].append(n1)

# 0번 노드부터 순서로 실행    
for i in range(n):
    if dfs(i, []):
        print(1)
        exit(0)
        
print(0)
exit(0)



