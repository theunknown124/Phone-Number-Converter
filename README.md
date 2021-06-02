# Phone-Number-Converter
This program was a class project that I did alone
Here is the Project Description:
Write a program that takes in words and outputs them as telephone numbers. Many companies use catch phrases for their company telephone number. For example 1-800-GET-CASH or 1-800-CAR-LOAN and etc. Your program should prompt the user to enter a phrase that represents a telephone number and then converts it to its corresponding digits. Let your program process only the first 11 characters (since some companies may use phrases that are longer than actual phone numbers). (Hints: read the phrase in as a String and then use the "charAt()" method to extract each letter/number). Let this method return "ERROR" if the phrase contains invalid characters (only letters, digits, spaces and hyphens are permissible)

In writing your program implement the following static methods:

public static char letterToDigit(char letter) - This method will take in a letter as a parameter and return the corresponding digit (return the digit as a character. NOTE: non letters should be returned unaltered e.g. "-", digits and etc.).


public static String wordsToPhoneNum(String phrase) - This method will take in a phrase (a string) and return the corresponding (11 digit or less) phone number. Let this method call on the method "letterToDigit" to break down each individual letter.

Example: wordsToPhoneNum("1-800-CALL-HOME") should yield 1-800-225-5466

Let your program run repetitively. Ask the user if they want to convert another phrase after each execution. When the user responds with "no" then let the program stop.
