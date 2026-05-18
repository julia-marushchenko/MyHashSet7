/**
 *  Java program to demonstrate HashSet.
 */

package com.mycollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *  SetDemo class.
 */
public class SetDemo {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating a HashSet.
        Set hashSet = new HashSet<>();

        // Inserting values into hashSet.
        hashSet.add("Object1");
        hashSet.add("Object2");
        hashSet.add("Object3");
        hashSet.add("Object4");

        // Printing values of hashSet to console.
        System.out.println(hashSet); // Output: [Object3, Object4, Object1, Object2]

        // Removing a value from hashSet.
        hashSet.remove("Object4");
        hashSet.remove("Object1");

        // Printing values of hashSet to console.
        System.out.println(hashSet); // Output: [Object3, Object2]

        // Iterating through the hashSet.
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {

            // Printing values of hashSet to console.
            System.out.println(it.next()); // Output: Object3 /nObject2

        }
    }
}