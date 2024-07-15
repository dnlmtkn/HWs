# Exercise 42: Day of the Week Activity Planner

## Objective
Learn how to use the `switch` statement in Java to handle multiple conditions based on the user's input, using an integer data type.

## Instructions

**Day of the Week Activity Planner**

In this project, you will write a small program that asks the user for a day of the week (1 for Monday, 2 for Tuesday, etc.) and then suggests an activity based on the input using a `switch` statement.

**For you to do:**

1. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

2. **Capture Day of the Week Input**
    - Print "Enter the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)".
    - Capture the user's input for the day of the week and store it in an integer variable called `dayOfWeek`.

3. **Suggest Activity using Switch Statement**
    - Use a `switch` statement to suggest an activity based on the day of the week:
        - Case 1: Print "Activity: Go to the gym".
        - Case 2: Print "Activity: Attend a coding meetup".
        - Case 3: Print "Activity: Go for a mid-week run".
        - Case 4: Print "Activity: Take a cooking class".
        - Case 5: Print "Activity: Movie night".
        - Case 6: Print "Activity: Family day".
        - Case 7: Print "Activity: Relax and recharge".
        - Default: Print "Invalid day entered".

## Expected Output
```
Enter the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)
1
Activity: Go to the gym
```

```
Enter the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)
5
Activity: Movie night
```

```
Enter the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)
8
Invalid day entered
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
