# Input and output matrix
n, m = int(input()), int(input())
res = []

for i in range(n):
    res.append([])
    for j in range(m):
        res[i].append(str(input()))

for i in range(n):
    for j in range(m):
        print(res[i][j], end=" ")
    print()


# Square Matrix input
matrix = [[input()]*n for _ in range(n)]


# read matrix
n = int(input())
matrix = []
for i in range(n):
    temp = [int(num) for num in input().split()]
    matrix.append(temp)

print(matrix)