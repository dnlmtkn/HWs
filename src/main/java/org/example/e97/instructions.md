# Exercise 97: Browser Validation Based on User Input

## Objective
Learn how to handle different cases of user input and use conditional statements to provide specific outputs.

## Instructions

**Browser Validation Based on User Input**

In this project, you will use the Scanner class to input a string value representing a browser name and print a message based on the input, considering different cases.

**For you to do:**

1. **Import Scanner Class**
    - Import the `Scanner` class from `java.util`.

2. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

3. **Prompt the User for Input**
    - Prompt the user to input a browser name.

4. **Use Conditional Statements**
    - Use conditional statements to print the message based on the input:
        - If the input is `"Chrome"`, `"chrome"`, `"CHROME"`, or `"ChRoMe"`, print `"Proceed with Chrome browser"`.
        - If the input is `"firefox"`, `"FIREFOX"`, or `"FireFOX"`, print `"Proceed with Firefox browser"`.
        - If the input is `"IE"`, `"ie"`, or `"iE"`, print `"Proceed with IE browser"`.
        - For any other input, print `"Invalid browser"`.

## Example Output
```
Please enter a browser name:
Chrome
Proceed with Chrome browser
```

```
Please enter a browser name:
Safari
Invalid browser
```

## Tips
- Ensure your Scanner object is created correctly and input is read properly.
- Use the `equalsIgnoreCase()` method to handle different cases of the input string.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect method calls.
- If the output is not as expected, ensure that the input string is read correctly and the conditional statements work as intended.

By following these steps, you should be able to successfully complete the exercise and understand how to handle different cases of user input in Java. Happy coding!
