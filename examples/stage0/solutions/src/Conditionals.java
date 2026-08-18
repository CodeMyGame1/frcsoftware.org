/*
 * Copyright 2026 FRCSoftware
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

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
    // print "Success!" if `statusCode` is "OK", and "There was an error."
    // otherwise. After running, change `statusCode` to "OK"; the code should 
    // now print "Success!"
    String statusCode = "ERROR";
    if (statusCode != "OK") {
        System.out.println("There was an error.");
    } else {
        System.out.println("Success!");
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

    // Sanitize and "deadband" the below input using the logical AND operator;
    // if `input` is between 5 and 100 (inclusive), print "Controller input detected"
    // Otherwise, print "Discarding input."
    // After running, change `input` to 2; the code should now print "Discarding input."
    double input = 20;
    if ((input >= 5) && (input <= 100)) {
        System.out.println("Controller input detected.");
    } else {
        System.out.println("Discarding input.");
    }

    // Define a variable `intakeEnabled` whose value is the inverse of `intakeDisabled`,
    // by using the logical NOT operator. Then print the value of `intakeEnabled`.
    // After running, change `intakeDisabled` to `true`; the code should now print
    // `false`.
    boolean intakeDisabled = false;
    boolean intakeEnabled = !intakeDisabled;
}