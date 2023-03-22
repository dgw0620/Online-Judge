A, B = input().split()

A = "".join(reversed(A))
B = "".join(reversed(B))

print(max(int(A), int(B)))