n = int(input())

for _ in range(n):
    result = ""
    for i in range(0,_+1):
        result += "".join("*")
    print(result)