num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))

if num2 <= num1:
    result = num1 - num2
    print("Result:", result)
else:
    print("Error: Second number must be smaller than or equal to the first number.")
