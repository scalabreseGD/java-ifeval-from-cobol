package com.example;

public class Ifeval {

    private String resultOfCompare;
    private String alpha1;
    private String alpha2;
    private int numeric1;
    private int numeric2;

    public static void main(String[] args) {
        Ifeval ifeval = new Ifeval();
        ifeval.run();
    }

    public void run() {
        example1();
        example2();
        example3();
        example4();
        example5();
        example6();
        example7();
    }

    // Example 1: IF statement, 2 alphanumeric items.
    private void example1() {
        System.out.println("Running Example 1");
        alpha1 = "cucumber";
        alpha2 = "radish";

        if (alpha1.equals(alpha2)) {
            resultOfCompare = "equal";
        } else {
            resultOfCompare = "different";
        }
        System.out.println("Result of compare: " + resultOfCompare);
    }

    // Example 2: IF statement, alphanumeric field vs literal
    private void example2() {
        System.out.println("Running Example 2");
        if (alpha1.equals("foobar")) {
            resultOfCompare = "equal";
        } else {
            resultOfCompare = "different";
        }
        System.out.println("Result of compare: " + resultOfCompare);
    }

    // Example 3: Verify a numeric item contains numeric data
    private void example3() {
        System.out.println("Running Example 3");
        String numeric2Str = "garbage";
        try {
            numeric2 = Integer.parseInt(numeric2Str);
            numeric2++;
        } catch (NumberFormatException e) {
            numeric2 = 1;
        }
        System.out.println("Numeric 2: " + numeric2);
    }

    // Example 4: Verify a numeric item is greater than zero
    private void example4() {
        System.out.println("Running Example 4");
        numeric1 = 0;
        numeric2 = 100;

        if (numeric1 > 0) {
            numeric2 = numeric2 / numeric1;
        } else {
            numeric2 = numeric2 - 1;
        }
        System.out.println("Numeric 2: " + numeric2);
    }

    // Example 5: IF statement, two numeric fields
    private void example5() {
        System.out.println("Running Example 5");
        numeric1 = 7;
        numeric2 = 36;
        if (numeric1 > numeric2) {
            resultOfCompare = "numeric-1";
        } else {
            resultOfCompare = "numeric-2";
        }
        System.out.println("Result of compare: " + resultOfCompare);
    }

    // Example 6: EVALUATE statement
    private void example6() {
        System.out.println("Running Example 6");
        numeric1 = 8;
        numeric2 = 13;

        if (numeric1 > numeric2) {
            resultOfCompare = "numeric-1";
        } else if (numeric1 < numeric2) {
            resultOfCompare = "numeric-2";
        } else {
            resultOfCompare = "equal";
        }
        System.out.println("Result of compare: " + resultOfCompare);
    }

    // Example 7: EVALUATE statement, two conditions
    private void example7() {
        System.out.println("Running Example 7");
        numeric1 = 8;
        numeric2 = 13;
        alpha1 = "THX-1138";
        alpha2 = "Terminator";

        if (numeric1 > numeric2 && alpha1.substring(0, 3).equals("THX")) {
            resultOfCompare = "THX and numeric-1";
        } else if (numeric1 < numeric2 && alpha1.substring(0, 3).equals("THX")) {
            resultOfCompare = "THX and numeric-2";
        } else if (numeric1 == numeric2 && alpha2.equals("Terminator")) {
            resultOfCompare = "Terminator and equal numbers";
        } else {
            resultOfCompare = "undefined";
        }
        System.out.println("Result of compare: " + resultOfCompare);
    }
}
