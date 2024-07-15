# Exercise 45: Coffee Shop Order Calculator

## Objective
Learn how to use the `switch` statement in Java to handle multiple conditions based on the user's input, using an integer data type.

## Instructions

**Coffee Shop Order Calculator**

In this project, you will write a small program that asks the user for their coffee order and then calculates the price based on predefined rates using a `switch` statement.

**For you to do:**

1. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

2. **Capture Coffee Order Input**
    - Print "Enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)".
    - Capture the user's input for the coffee type and store it in an integer variable called `coffeeType`.

3. **Calculate Price using Switch Statement**
    - Use a `switch` statement to calculate the price based on the coffee type:
        - Case 1: Espresso costs $3.00.
        - Case 2: Latte costs $4.00.
        - Case 3: Cappuccino costs $4.50.
        - Case 4: Mocha costs $5.00.
        - Default: Print "Invalid coffee type entered".

4. **Print the Price**
    - Print "The price of your coffee is $" followed by the calculated amount.

## Expected Output
```
Enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)
1
The price of your coffee is $3.0
```

```
Enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)
2
The price of your coffee is $4.0
```

```
Enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)
5
Invalid coffee type entered
```

## Tips
- Remember to import the `Scanner` class using `import java.util.Scanner;`.
- Ensure your variables are declared and assigned correctly.
- Use a `switch` statement to handle multiple conditions based on the user's input.

## Additional Information
- **Scanner Class**: The `Scanner` class is used to get user input. It is found in the `java.util` package.
- **Switch Statement**: The `switch` statement is used to execute one block of code among many based on the value of a variable.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, ensure that the input is captured and printed correctly.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `switch` statement in Java. Happy coding!
