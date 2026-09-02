/*
 * Copyright 2026 FRCSoftware
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

class Drivetrain {
    public double setThrottle(double speed) {
       return speed;
    }
}

Drivetrain drivetrain = new Drivetrain();

void main() {
    // Using the variable `shooterEnabled` below, decide whether to turn on
    // (shooterVelocity = 1) or turn off (shooterVelocity = 0) the shooter motors.
    // Then print the value of `shooterVelocity`. After running, change
    // `shooterEnabled` to `true`; the code should now print 1
    boolean shooterEnabled = false;
    int shooterVelocity;
    if (shooterEnabled == true) {
        shooterVelocity = 1;
    } else {
        shooterVelocity = 0;
    }
    System.out.println(shooterVelocity);

    // Using only the NOT EQUALS operator, and the variable `statusCode` below,
    // print "Success!" if `statusCode` is 0, and "There was an error."
    // if `statusCode` is 1. Else, you should print "User exited code."
    // After running, change `statusCode` to 0, then 2; the code should 
    // print "Success!" and "User exited code." respectively.
    int statusCode = 1;
    if (statusCode != 1) {
        System.out.println("Success!");
    } else if (statusCode != 0) {
        System.out.println("There was an error.");
    } else {
        System.out.println("User exited code.");
    }

    // if `input` is over 5, print "Controller input detected"
    // and use `drivetrain.setThrottle()`, passing in the input.
    // Otherwise, print "Discarding input." and set input to 0.
    // After running, change `input` to 2; the code should now print "Discarding input."
    double input = 20;
    drivetrain.setThrottle(input);
    if (input >= 5) {
        System.out.println("Controller input detected.");
    } else {
        input = 0;
        System.out.println("Discarding input.");
    }

    // If the value of `shooterAngleDeg` exceeds 75 degrees OR is less than 10 degrees,
    // print "The shooter has been stopped." Otherwise, print "The shooter is moving."
    // After running, change `shooterAngleDeg` to 76; the code should now print
    // "The shooter has been stopped."
    int shooterAngleDeg = 54;
    if (shooterAngleDeg > 75 || shooterAngleDeg < 10) {
        System.out.println("The shooter has been stopped.");
    } else {
        System.out.println("The shooter is moving.");
    }

    // Define a variable `intakeEnabled` whose value is the inverse of `intakeDisabled`,
    // by using the logical NOT operator. Then print the value of `intakeEnabled`.
    // After running, change `intakeDisabled` to `true`; the code should now print
    // `false`.
    boolean intakeDisabled = false;
    boolean intakeEnabled = !intakeDisabled;
    System.out.println(intakeEnabled);
}