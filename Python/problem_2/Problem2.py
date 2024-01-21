def solve(limit):
    cur, prev, result = 0, 1,0
    while cur < limit:
        result += cur if cur % 2 == 0 else 0
        prev, cur = cur, prev + cur
    return result

