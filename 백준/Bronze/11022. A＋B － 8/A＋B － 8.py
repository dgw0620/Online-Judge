T = int(input())

for i in range(0,T):
    a, b = map(int,input().split())
    print('Case #{}: {} + {} = {}'.format(i + 1,a ,b ,a+b))