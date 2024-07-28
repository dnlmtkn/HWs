# Exercise 64: Print Series of Numbers Using For Loop

## Objective
Learn how to use the `for` loop in Java to iterate and print a series of numbers based on user input.

## Instructions

**Print Series of Numbers Using For Loop**

In this project, you will write a small program that prints a series of numbers starting at 0 and ending at the doubled value of a user-defined value `end`, exclusive. Each number should be on the same line, separated by a space.

**For you to do:**

1. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

2. **Prompt the User for Input**
    - Print "Int: " to prompt the user to enter a value for `end`.
    - Read the user input and store it in an integer variable `end`.

3. **Initialize the Loop**
    - Use a `for` loop that starts with `i` equal to 0 and increments `i` by 1 each iteration.

4. **Use the For Loop to Print the Series**
    - Ensure the loop continues as long as `i` is less than `2 * end`.
    - Inside the loop:
        - Print the value of `i` followed by a space.

## Expected Output
```
Int: 5
0 1 2 3 4 5 6 7 8 9
Int: 8
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
Int: -5
(no output)
```

## Tips
- Ensure your `for` loop has the correct condition to avoid infinite loops.
- Remember to increment the `i` variable by 1 to ensure the loop terminates correctly.

## Additional Information
- **For Loop**: A `for` loop repeatedly executes a block of statements a specified number of times.
- **Scanner Class**: The `Scanner` class is used to get user input. It is found in the `java.util` package.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, ensure that the loop condition and the increment statement are correct.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `for` loop in Java. Happy coding!
