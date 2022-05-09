n = int(input())
str = list()
count = 0

for i in range(0,n):
    a = input()
    str.append(a + '0')

for i in range(len(str)):
    check = 0
    for j in range(len(str[i]) - 2):
        for k in range(str[i].find(str[i][j]),len(str[i])):
            if str[i][j] != str[i][k]:
                num = k
                break

        for m in range(num,len(str[i])):
            if str[i][j] == str[i][m]:
                check = 1
                break
    if check == 0:
        count += 1

print(count)