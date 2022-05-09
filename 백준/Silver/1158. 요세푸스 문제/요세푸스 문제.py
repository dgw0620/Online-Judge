
n, k = map(int, (input().split()))
people = list(map(str, range(1, n + 1)))
result = []
k -= 1
tmp = k

while people:
    while k >= len(people):
        k -= len(people)
    result.append(people[k])
    del people[k]
    k += tmp

print("<" + ", ".join(result) + ">")