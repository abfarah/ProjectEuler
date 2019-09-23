memo = {1: 1}

def solveUtil(x):
    if x in memo:
        return memo[x]
    
    if x % 2 == 0:
        memo[x] = 1+ solveUtil(x//2)
    else:
        memo[x] = 1+ solveUtil(3*x +1)

    return memo[x]

def solve():
    count = 1000000
    maxNumb = 0
    maxNumbChain = 0
    for i in range(count//2, count):
        j = solveUtil(i)
        if j > maxNumbChain:
            maxNumbChain = j
            maxNumb = i
    return maxNumb

print(str(solve()))


