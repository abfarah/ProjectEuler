def solve():
    sumSq, sqSum = 0, 0
    for i in range(1, 101, 1):
        sumSq += i**2
        sqSum += i
    return (sqSum**2)-sumSq

