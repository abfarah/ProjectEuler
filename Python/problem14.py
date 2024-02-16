def count(n, memo):
    if n in memo:
        return memo[n]
    numb = n
    count = 1
    while numb != 1:
        if numb in memo:
            count += memo[numb]-1
            break
        if numb % 2 == 0:
            numb /= 2
        else:
            numb = numb*3 + 1
        count += 1
    memo[n] = count
    return count

def solve(numb):
    memo = {}
    maxCount = 0
    res = 1
    for i in range(numb, 0, -1):
        tempCount = count(i, memo)
        if maxCount < tempCount:
            res = i
            maxCount = tempCount
    return res

