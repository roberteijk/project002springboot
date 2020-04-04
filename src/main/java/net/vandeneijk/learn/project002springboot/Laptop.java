/**
 * Created by Robert van den Eijk on 4-4-2020.
 */

package net.vandeneijk.learn.project002springboot;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    public Laptop() {
    }

    public void compile() {
        System.out.println("Compiling...");
    }
}
