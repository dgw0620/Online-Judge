import sys

n = int(sys.stdin.readline())
wordList = []

for _ in range(n):
    word = sys.stdin.readline()
    wordList.append(word.rstrip())

wordList = list(set(wordList))
wordList.sort(key=lambda x: (len(x), x))

for word in wordList:
    print(word)