public class Print {
    public static void main(String args[]) {
        // Print "Hello World!", with a newline at the end.
        System.out.println("Hello World!");

        // Print the following lines, each with a separate `println()` statement:
        // The robot knows where it is at all times.
        // It knows this because it knows where it isn't.
        System.out.println("The robot knows where it is at all times.");
        System.out.println("It knows this because it knows where it isn't.");

        // Define a variable `pi` that is equal to 3.14159.
        double pi = 3.14159;
        // Define a variable `g` that is equal to 10.
        int g = 10;
        // Define a variable `mode` that is equal to "autonomous".
        String mode = "autonomous";

        // Now, print all three variables in the **same** print statement,
        // separated by spaces.
        System.out.println(pi + " " + g + " " + mode);

        // Now, change pi to equal 3.142857. Then, print the value of `pi` again.
        pi = 3.142857;
        System.out.println(pi);
        
        // Create a variable `degrees` of type `double` and assign it a value of
        // 360. Then, print the variable to observe the type narrowing behavior
        // (it stores as a double, although an integer was passed to it).
        double degrees = 360;
        System.out.println(degrees);
    }
}