# By Abdullahi Farah
#
# Problem 3:
# The prime factors of 13195 are 5, 7, 13 and 29.
#
# What is the largest prime factor of the number 600851475143 ?

import math

primeFactor = 2
previousFactor = 1

def solve(numb):
    if(numb%2 == 0):
        previousFactor = 2
        while(numb%2 == 0):
            numb /= 2
    else:
        previousFactor = 1
    
    primeFactor = 3
    limit = math.sqrt(numb)

    while (numb > 1 and primeFactor <= limit):
        if(numb%primeFactor == 0):
            previousFactor = primeFactor
            while(numb%primeFactor == 0):
                numb /= primeFactor
            limit = math.sqrt(numb)
        primeFactor += 2

    if (numb == 1):
        return previousFactor
    else:
        return numb
