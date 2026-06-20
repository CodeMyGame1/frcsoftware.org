package solution;

public class Operators {
    public static void main(String[] args) {
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

        // TODO: Type casting if requested.

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
}
