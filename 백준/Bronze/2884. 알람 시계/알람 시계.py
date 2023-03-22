
H, M = map(int, input().split())

if M >= 45:
    print(str(H) + " " + str(M - 45))
elif H == 0:
    print("23 " + str(15 + M))
else:
    print(str(H - 1) + " " + str(15 + M))