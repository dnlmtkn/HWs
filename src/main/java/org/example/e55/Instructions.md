# Exercise 55: Collecting User Input Until a Specific Condition Using Do-While Loop

## Objective
Learn how to use the `do-while` loop in Java to collect user input until a specific condition is met.

## Instructions

**Collecting User Input Until a Specific Condition Using Do-While Loop**

In this project, you will write a small program that collects user input for their favorite number until they enter the number 7, using a `do-while` loop.

**For you to do:**

1. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

2. **Declare a Variable for User Input**
    - Declare an integer variable called `favoriteNumber`.

3. **Use a Do-While Loop to Collect User Input**
    - Create a `do-while` loop that continues until the user enters the number 7.
    - Inside the loop:
        - Print "Enter your favorite number:".
        - Capture the user's input and store it in the `favoriteNumber` variable.
        - Print "You entered: " followed by the value of `favoriteNumber`.

4. **Print Completion Message**
    - Once the loop exits, print "You've entered 7! Loop ends."

## Expected Output
```
Enter your favorite number:
3
You entered: 3
Enter your favorite number:
5
You entered: 5
Enter your favorite number:
7
You entered: 7
You've entered 7! Loop ends.
```

## Tips
- Ensure your `do-while` loop has the correct condition to avoid infinite loops.
- Remember to update the `favoriteNumber` variable inside the loop to ensure the loop terminates correctly.

## Additional Information
- **Do-While Loop**: A `do-while` loop repeatedly executes a block of statements at least once, and then continues to execute the block as long as a specified condition is true.
- **Scanner Class**: The `Scanner` class is used to get user input. It is found in the `java.util` package.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, ensure that the loop condition and the input statement are correct.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `do-while` loop in Java. Happy coding!
