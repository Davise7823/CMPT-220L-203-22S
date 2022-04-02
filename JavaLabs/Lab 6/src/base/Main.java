package base;

import java.util.*;

public class Main {
    /**
     * # Lab Six
     * ---
     *
     * For this lab we're going to be messing around with our Linear Data Types,
     * as well as creating a plant Object!
     *
     * Our Goals are:
     * - Creating an Array
     * - Creating an ArrayList
     * - Creating an LinkedList
     * - Creating an Queue
     * - Creating an Stack
     * - Create a Plant
     *
     * Please show the ability to:
     * - Create these data types
     * - Populate the data types
     * - Print out the Linear Data Types
     */

    public static class plant {
        String type;
        int height;
        String place;

        public plant(int height, String type, String place){
            this.height = height;
            this.place = place;
            this.type = type;
        }

        public void description(){
            System.out.println(this.height, this.type ,this.place);
        }

    }


    public static void main(String[] args) {
        // Create an Array, Populate it, and Print it out
        int[] item = {1,2,3,4,5,6,7,8,9,10};
        for (int no : item) {
            System.out.println(no);
        }

        // Create an ArrayList, Populate it, and Print it out
        ArrayList<Integer> items = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        for(int no : items){
            System.out.println(no);
        }

        // Create an LinkedList, Populate it, and Print it out
        LinkedList<String> stringl = new LinkedList<>(Arrays.asList("squeeze", "started","Bubblestrangler"));
        for(String word : stringl){
            System.out.println(word);
        }

        // Create an Queue, Populate it, and Print it out
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(q);

        // Create an Stack, Populate it, and Print it out
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        System.out.println(s);

        // Using the information in the Lab 6 Jupyter Notebook create an instance of plant here.
        plant p = new plant(24,"fern", "garden");

    }
}
