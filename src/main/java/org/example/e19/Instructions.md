# Exercise 19: Activity Time Tracker

## Objective
Learn how to use type casting in Java through a practical scenario involving tracking and converting time spent on activities.

## Instructions

**Activity Time Tracker**

In this project, you will write a small program that calculates the total time spent on different activities in minutes, converts it to hours and minutes using type casting, and prints both the original and converted times.

**For you to do:**

1. **Create Variables**
    - Create double variables for the time spent on three activities: `activity1`, `activity2`, and `activity3`. Assign any values to these variables (e.g., 45.5, 30.2, and 60.7).

2. **Calculate Total Time**
    - Add the time spent on the three activities to calculate the total time and store the result in a variable called `totalTime`.

3. **Convert Total Time to Hours and Minutes**
    - Use type casting to convert `totalTime` to an integer value, effectively rounding it down to get the total minutes.
    - Calculate the number of hours by dividing the total minutes by 60 and storing the result in a variable called `hours`.
    - Calculate the remaining minutes using the modulus operator and store the result in a variable called `minutes`.

4. **Print the Results**
    - Print the original total time in minutes and the converted time in hours and minutes in the following format:


## Expected Output
```
The original total time is 136.4 minutes.
The converted time is 2 hours and 16 minutes.
```

## Tips
- Remember to use `System.out.println` to print the results.
- Ensure your variables are declared and assigned correctly.
- Use type casting to convert the double to an int for total minutes.

## Additional Information
- **Type Casting**: Type casting is used to convert a variable from one type to another. In this case, from double to int.
- **Double and Int Variables**: A double variable can hold decimal numbers, while an int variable holds whole numbers.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, ensure that the variables are assigned the correct values, the calculations are correct, and the type casting is done properly.

By following these steps, you should be able to successfully complete the exercise and understand how to use type casting in Java. Happy coding!
