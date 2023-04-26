def divide(a, b):
    assert b != 0, "Error: division by zero"
    return a / b


# Test the divide function with various inputs
print(divide(10, 2))  # Output: 5.0

# Raises an AssertionError with the error message "Error: division by zero"
# print(divide(10, 0))
