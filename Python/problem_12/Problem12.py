# By: Abdullahi Farahe
# Problem 12
#

from math import sqrt

def solve():
    triNumb = 1
    div = 1
    count = 0
    while count <= 500:
        count = 0
        div +=1
        triNumb += div
        square = int(sqrt(triNumb))
        for i in range(1,square+1):
            if triNumb % i ==  0:
                count += 2

        if square * square == triNumb:
            count -= 1
    return triNumb

print(solve())
