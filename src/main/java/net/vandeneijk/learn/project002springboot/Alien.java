/**
 * Created by Robert van den Eijk on 4-4-2020.
 */

package net.vandeneijk.learn.project002springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired
    private Laptop laptop;

    public void code() {
        laptop.compile();
    }
}
