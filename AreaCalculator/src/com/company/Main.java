package com.company;

/*
Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
The method needs to return an area of a rectangle.
If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
For formulas and PI value please check the tips below.
Examples of input/output:
* area(5.0); should return 78.53975
* area(-1);  should return -1 since the parameter is negative
* area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
* area(-1.0, 4.0);  should return -1 since first the parameter is negative
TIP: The formula for calculating the area of a rectangle is x * y.
TIP: The formula for calculating a circle area is radius * radius * PI.
TIP: For PI use a constant from Math class e.g. Math.PI
NOTE: All methods need to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a main method to your solution code!
*/
public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(area(5.0));
        System.out.println(area(5));
        System.out.println(area(-1));
        System.out.println(area(0));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(5, 4.1));
        System.out.println(area(-1, 4));
        System.out.println(area(0, 4));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return Math.pow(radius, 2) * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }

}
