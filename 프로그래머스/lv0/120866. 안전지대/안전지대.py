def solution(board):
    c = [[0 for _ in range(len(board) + 2)] for _ in range(len(board) + 2)]
    answer = 0
    
    for i in range(len(board)):
        for j in range(len(board)):
            if board[i][j] == 1:
                c[i + 1][j + 1] = 1
                c[i][j] = 1
                c[i][j + 1] = 1
                c[i][j + 2] = 1
                c[i + 1][j] = 1
                c[i + 1][j + 1] = 1
                c[i + 1][j + 2] = 1
                c[i + 2][j] = 1
                c[i + 2][j + 1] = 1
                c[i + 2][j + 2] = 1
    
    for i in range(1, len(c) - 1):
        for j in range(1, len(c) - 1):
            if c[i][j] == 0:
                answer += 1
    return answer