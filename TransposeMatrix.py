def transpose(matrix):
    r = len(matrix)-1
    c = len(matrix[0]) -1
    temp = 0
    i=0
    while i <=r:
        j=0
        while j<= (c/2):
            temp = matrix[i][j]
            matrix[i][j] = matrix[i][c-j]
            matrix[i][c-j] =temp
            j = j+1
        i = i+1
