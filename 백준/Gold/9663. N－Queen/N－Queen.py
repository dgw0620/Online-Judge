import sys

def NQueenFound(level):
    global count
    global position

    if level == n: # Level이 n이면 횟수 1 증가
        count += 1
        position[level - 1] = -1
        return 1

    else:
        for i in range(n):
            if Promising(i, level):
                position[level] = i
                NQueenFound(level + 1)

        position[level] = -1

def Promising(posi, level): # 가능한지 확인하는 함수
    for i in range(level):
        if posi == position[i] or level - i == abs(posi - position[i]): # 대각선과 일직선상에 없는지 확인
            return False
    return True

if __name__ == "__main__":
    n = int(sys.stdin.readline())
    count = 0
    position = [-1] * n
    
    NQueenFound(0)

    print(count)
