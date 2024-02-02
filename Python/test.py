import importlib

# Define problems that require one variable and their test inputs
one_variable_problems = {1: 1000, 2: 4000000, 3: 600851475143, 7: 10001}

def test_problem(problem_number, input_arg=None):
    # Dynamically import the problem module
    problem_module = importlib.import_module(f"problem{problem_number}")

    if hasattr(problem_module, 'solve'):
        if input_arg is not None:
            return problem_module.solve(input_arg)
        else:
            return problem_module.solve()
    else:
        print(f"No solve method in problem_{problem_number}")

# Test all problems
def main():
    for i in range(1, 8):
        if i in one_variable_problems:
            result = test_problem(i, one_variable_problems[i])
        else:
            result = test_problem(i)

        print(f"Result of problem {i}: {result}")

if __name__ == "__main__":
    main()

