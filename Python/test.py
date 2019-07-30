# Unit test for project euler solutions
# By Abdullahi Farah

from problem_1 import Problem1
from problem_2 import Problem2
from problem_3 import Problem3
from problem_4 import Problem4
from problem_5 import Problem5
from problem_6 import Problem6
from problem_7 import Problem7
from problem_8 import Problem8
from problem_9 import Problem9
from problem_10 import Problem10
import unittest

class test(unittest.TestCase): 
    def test_problem1(self):
        self.assertEqual(Problem1.solve(1000),233168)

    def test_problem2(self):
        self.assertEqual(Problem2.solve(),4613732)

    def test_problem3(self):
        self.assertEqual(Problem3.solve(600851475143),6857)

    def test_problem4(self):
        self.assertEqual(Problem4.solve(),906609)

    def test_problem5(self):
        self.assertEqual(Problem5.solve(),232792560)

    def test_problem6(self):
        self.assertEqual(Problem6.solve(),25164150)

    def test_problem7(self):
        self.assertEqual(Problem7.solve(10001),104743)

    def test_problem8(self):
        self.assertEqual(Problem8.solve(),23514624000)

    def test_problem9(self):
        self.assertEqual(Problem9.solve(),31875000)

    def test_problem10(self):
        self.assertEqual(Problem10.solve(2000000),142913828922)




if __name__ == '__main__': 
    unittest.main()
