# Exercise 41: Meal Recommendation Based on Time of Day

## Objective
Learn how to use the `switch` statement in Java to handle multiple conditions based on the user's input.

## Instructions

**Meal Recommendation**

In this project, you will write a small program that asks the user for the time of day (morning, afternoon, evening, night) and then suggests a meal based on the input using a `switch` statement.

**For you to do:**

1. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

2. **Capture Time of Day Input**
    - Print "Enter the time of day (morning, afternoon, evening, night)".
    - Capture the user's input for the time of day and store it in a variable called `timeOfDay`.

3. **Recommend Meal using Switch Statement**
    - Use a `switch` statement to recommend a meal based on the time of day:
        - Case "morning": Print "Recommended meal: Breakfast".
        - Case "afternoon": Print "Recommended meal: Lunch".
        - Case "evening": Print "Recommended meal: Dinner".
        - Case "night": Print "Recommended meal: Snack".
        - Default: Print "Invalid time of day entered".

## Expected Output
```
Enter the time of day (morning, afternoon, evening, night)
morning
Recommended meal: Breakfast
```

```
Enter the time of day (morning, afternoon, evening, night)
night
Recommended meal: Snack
```

```
Enter the time of day (morning, afternoon, evening, night)
midnight
Invalid time of day entered
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
