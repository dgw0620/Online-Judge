n = list(map(int, input().split()))

if n[0] == 1:
    for i in range(8):
        if n[i] != i + 1:
            print("mixed")
            exit()
    print("ascending")
elif n[0] == 8:
    for i in range(8):
        if n[i] != 8 - i:
            print("mixed")
            exit()
    print("descending")
else:
    print("mixed")