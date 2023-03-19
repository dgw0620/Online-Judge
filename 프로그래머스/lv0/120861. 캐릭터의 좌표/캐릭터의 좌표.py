def solution(keyinput, board):
    answer = [0, 0]
    max_board_x=(board[0]-1)/2
    max_board_y=(board[1]-1)/2

    for i in keyinput:
        if i =="up":
            if max_board_y >= answer[1]+1:
                answer[1]=answer[1]+1
            else:
                continue
        elif i =="down":
            if -max_board_y <= answer[1]-1:
                answer[1]=answer[1]-1
            else:
                continue
        elif i =="right":
            if max_board_x >= answer[0]+1:
                answer[0]=answer[0]+1
            else:
                continue
        elif i=="left":
            if -max_board_x <= answer[0]-1:
                answer[0]=answer[0]-1
            else:
                continue

    return answer
            