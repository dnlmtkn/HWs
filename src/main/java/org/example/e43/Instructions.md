# Exercise 43: Electricity Bill Calculator

## Objective
Learn how to use the `switch` statement in Java to handle multiple conditions based on the user's input, using an integer data type.

## Instructions

**Electricity Bill Calculator**

In this project, you will write a small program that asks the user for their electricity usage in kWh (kilowatt-hours) and then calculates the bill based on predefined rates using a `switch` statement.

**For you to do:**

1. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

2. **Capture Electricity Usage Input**
    - Print "Enter your electricity usage in kWh".
    - Capture the user's input for the usage and store it in an integer variable called `usage`.

3. **Calculate Bill using Switch Statement**
    - Use a `switch` statement to calculate the bill based on the usage:
        - Case 0-100: Multiply usage by $0.12 per kWh.
        - Case 101-200: Multiply usage by $0.15 per kWh.
        - Case 201-300: Multiply usage by $0.20 per kWh.
        - Case 301 and above: Multiply usage by $0.25 per kWh.
        - Default: Print "Invalid usage entered".

4. **Print the Bill**
    - Print "Your electricity bill is $" followed by the calculated amount.

## Expected Output
```
Enter your electricity usage in kWh
50
Your electricity bill is $6.0
```

```
Enter your electricity usage in kWh
150
Your electricity bill is $22.5
```

```
Enter your electricity usage in kWh
350
Your electricity bill is $87.5
```

```
Enter your electricity usage in kWh
-10
Invalid usage entered
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
