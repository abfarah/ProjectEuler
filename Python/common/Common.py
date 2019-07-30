# By Abdullahi Farah
# 
# Common python file with commonly used fuctions
# 

import math

def isPrime(numb):
	if numb == 1:
		return False
	if numb < 4:
		return True
	if numb % 2 == 0:
		return False
	if numb < 9:
		return True
	if numb % 3 == 0:
		return False

	limit = int(math.sqrt(numb))
	count = 5
	while count <= limit:
		if numb % count == 0:
			return False
		count += 2
	return True

def isPalindrome(s):
    reverse = s[::-1]
    return (reverse == s)
