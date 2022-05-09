import sys

def BinarySearch(start, end, target):
    if start > end:
        return 0

    mid = (start + end) // 2

    if nList[mid] == target:
        return 1

    elif nList[mid] > target:
        end = mid - 1
    else:
        start = mid + 1

    return BinarySearch(start, end, target)






if __name__ == "__main__":
    n = int(sys.stdin.readline())
    nList = list(map(int, sys.stdin.readline().split()))

    m = int(sys.stdin.readline())
    mList = list(map(int, sys.stdin.readline().split()))

    nList.sort()

    for mNum in mList:
        print(BinarySearch(0, n - 1, mNum))
