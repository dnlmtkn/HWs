**For you to do:**

Create a method that will be available to all classes in your project with following specifications:

Returns:

```
a String
```

Name:

```
alphabetical
```

Parameters:

```
a String called str
```

Purpose:

```
Return a string that is composed of each letter as long as the letter is later on in the alphabet
```

```
than its previous one.  You can assume actual parameters are lowercase.
See below examples.
```

Additional Info:

You can use < and > to compare characters (not Strings), where characters later on in the alphabet are "greater".  Examples:

```
'a' < 'b' ==> True
```

```
'a' < 'a' ==> False
```

```
'a' > 'b' ==> False
```

Examples:

```
alphabetical("hello") ==> "hlo"
```

```
alphabetical("software") ==> "stwr"
```

```
alphabetical("language") ==> "lnug"
```

**Expected Output:**

```
hlo
stwr
lnug
```

