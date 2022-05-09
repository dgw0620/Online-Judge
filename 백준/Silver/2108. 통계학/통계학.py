import sys
from collections import Counter

n = int(sys.stdin.readline())
nList = []

for _ in range(n):
    num = int(sys.stdin.readline())
    nList.append(num)

nList.sort()

print(int(round(sum(nList)/n, 0)))

print(nList[int(n/2)])

# collections의 Counter을 이용하여 빈도수 계산
# most_common을 사용하여 최빈도값 k개를 계산
cnt = Counter(nList).most_common(2)
if n > 1:
    if cnt[0][1] == cnt[1][1]:
        print(cnt[1][0])
    else:
        print(cnt[0][0])
else:
    print(cnt[0][0])

print(abs(nList[-1] - nList[0]))