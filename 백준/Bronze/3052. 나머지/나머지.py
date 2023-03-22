n_s = set()
for i in range(10):
    n = int(input())

    if n % 42 not in n_s:
        n_s.add(n % 42)

print(len(n_s))