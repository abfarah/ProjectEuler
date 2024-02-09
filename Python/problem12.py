from common import divisorCount

def solve(numb):
    i, res = 1, 1
    while divisorCount(res) < numb:
        i += 1
        res += i
    return res

