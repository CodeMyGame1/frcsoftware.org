void main() {
    // Create two integer variables, `first` and `second`. Assign `first`
    // a value of 5, and `second` a value of 4. Then, print the sum of
    // `first` and `second`.
    int first = 5;
    int second = 4;
    System.out.println(first + second);

    // Create an integer variable `result`. Multiply the sum of 1 + 6 by the
    // difference of 7 and 8, and store it in this variable. Then, print
    // the value of `result`.
    int result = (1 + 6) * (7 - 8);
    System.out.println(result);

    // Given the below variable `rotPerSec`, create a variable `rotPerHour`
    // whose value represents the corresponding amount of rotations per
    // hour for `rotPerSec`. Then, print the value of `rotPerHour`.
    int rotPerSec = 5;
    int rotPerHour = rotPerSec * 60 * 60;
    System.out.println(rotPerHour);

    // Create an integer variable `quotient1`, and assign to it the value
    // of 5 divided by 3. Then print the value of `quotient1`.
    double quotient1 = 5 / 3;
    System.out.println(quotient1);

    // Create a variable `quotient2` of type double, and assign to it the
    // value of 5.0 divided by 3. Then print the value of `quotient2`.
    double quotient2 = 5.0 / 3;
    System.out.println(quotient2);
    
    // Create a variable `normalizedAngle` that takes `rawEncoderDegrees`
    // and calculates its "true" value (as a degree amount from 0 to 360).
    // Then print the value of `normalizedAngle`.
    int rawEncoderDegrees = 560;
    int normalizedAngle = 560 % 360;
    System.out.println(normalizedAngle);

    // Using only the increment operator, add 1 to the `timer` variable below.
    // Then print the value of `timer`.
    int timer = 1000;
    timer++;
    System.out.println(timer);

    // Using only the decrement operator, subtract 1 from the `secondsLeftInMatch`
    // variable below. Then print the value of `secondsLeftInMatch`.
    int secondsLeftInMatch = 85;
    secondsLeftInMatch--;
    System.out.println(secondsLeftInMatch);

    // Print the sum, difference, product, and quotient of the two variables
    // below. Especially take note of how the quotient is printed.
    int num1 = 15;
    int num2 = 2;
    System.out.println(num1 + num2);
    System.out.println(num1 - num2);
    System.out.println(num1 * num2);
    System.out.println(num1 / num2);

    // Create a variable `avg` of type double, and assign to it the average
    // of the values 2, 5, and 4. Then print the value of `avg`.
    // HINT: How can you ensure the result is not improperly rounded?
    double avg = (2 + 5 + 4) / 3.0;
    System.out.println(avg);
}