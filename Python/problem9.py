import math
from collections import deque

def solve(numb):
    for i in range(1, numb):
        for j in range(i+1, numb):
            c = numb - i - j
            if (i**2) + (j**2) == (c**2):
                return i*j*c
    return -1

