package base;

public class Main {
    /**
     * # Lab Four
     * ---
     *
     * For this lab we're going to be making and using a bunch of functions.
     *
     * Our Goals are:
     * - Switch Case
     * - Looping
     * - Making our own functions
     * - Combining functions
     * - Structuring solutions
     */
    public static void main(String[] args) {
        // Give me an example of you using switch case
        int day = 6;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        // Give me an example of you using a for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // Give me an example of you using a while loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

    }
    // For the following todos you'll probably want to define them below and then call them from the main function above.

    /**
     * I want you to write a function that will take in a number and raise it to the power given.
     * For example if given the numbers 2 and 3. The math that the function should do is 2^3
     * and should print out or return 8. Print the output.
     */
    int x = 2;
    int y = 3;

    double exponential(int x , int y){
        double sol = Math.pow(x,y);
        return sol;
    }

    /**
     * I want you to write a function that will take in a list and see how many times a given number is in the list.
     * For example if the array given is [2,3,5,2,3,6,7,8,2] and the number given is 2 the function should print out
     * or return 3. Print the output.
     */
    int [] array = {2,3,5,2,3,6,7,8,2};

    int amount(int[] arr){
        int j = 0;
        for(int num : arr) {
            int i = arr[num];
            if (num == i) {
                j++;
            }
        }
        return j;
    }


    /**
     * Create a function named summation that will take in an int[ ] and return an int.
     * I want the function to then go through the given array and sum up digits in the array.
     * Once that’s done print or return the answer. Print the output
     */

    int summation(int[] arr ){
        int n = 0;
        for(int num : arr ){
            n = n + num;
        }
        return n;
    }

    /**
     * Give me a function that gives the answer to the pythagorean theorem.
     * I'd like you to reuse the exponent function from above as well as the functions below to make your function.
     *
     * If you don't remember the pythagorean theorem the formula is (a^2 + b^2 = c^2).
     * Given a and b as parameters i'd like you to return c.
     *
     * If this doesn't make sense look up `Pythagorean Theorem Formula` on google.
     *
     * Once that’s done print or return the answer. Print the output
     */

    int a = 4;
    int b = 5;

    double pythag(int a, int b){
            double ans2 = Math.pow(a,2) + Math.pow(b,2);
            double ans = Math.sqrt(ans2);
            return ans;
        }




    int addition(int a, int b) {
        int answer = a + b;
        return answer;
    }

    int division(int a, int b) {
        int answer = a / b;
        return answer;
    }
}