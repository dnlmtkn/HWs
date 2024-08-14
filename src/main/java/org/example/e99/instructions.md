# Exercise 99: Palindrome Checker

## Objective
Learn how to check if a string is a palindrome in Java.

## Instructions

**Palindrome Checker**

In this project, you will write code to take a string input and check if it is a palindrome or not. A palindrome means that the characters are the same forwards and backwards, ignoring spaces and case differences.

**For you to do:**

1. **Import Scanner Class**
    - Import the `Scanner` class from `java.util`.

2. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

3. **Prompt the User for Input**
    - Prompt the user to input a string.

4. **Check if the String is a Palindrome**
    - Remove all spaces and convert the string to lowercase.
    - Check if the string reads the same forwards and backwards.

5. **Print the Result**
    - Print "true" if the string is a palindrome, and "false" otherwise.

## Example Output
```
Please enter a string:
racecar
true
```

```
Please enter a string:
hello
false
```

## Tips
- Ensure your Scanner object is created correctly and input is read properly.
- Use `replaceAll()` to remove spaces and `toLowerCase()` to convert the string to lowercase.
- Use a loop or `StringBuilder` to reverse the string and compare it to the original.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect method calls.
- If the output is not as expected, ensure that the string is processed correctly and the palindrome check works as intended.

By following these steps, you should be able to successfully complete the exercise and understand how to check if a string is a palindrome in Java. Happy coding!
