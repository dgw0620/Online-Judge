import sys
input = sys.stdin.readline

def find_complex(y, x):
    global count
    if y < 0 or x < 0 or y >= n or x >= n:
        return

    elif m[y][x] == 1:
        m[y][x] = -1
        count += 1
        find_complex(y - 1, x)
        find_complex(y, x + 1)
        find_complex(y + 1, x)
        find_complex(y, x - 1)


n = int(input())
m = []
cnt_list = []
count = 0

for _ in range(n):
    m.append(list(map(int, input().strip())))

for y in range(n):
    for x in range(n):
        if m[y][x] == 1:
            find_complex(y, x)
            cnt_list.append(count)
            count = 0

print(len(cnt_list))
for c in sorted(cnt_list):
    print(c)