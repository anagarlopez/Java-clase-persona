package com.ana.dev;

import com.ana.dev.models.Person;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Person pepa = new Person("Pepa", "Anónima", "00112233G", 1956);
        pepa.name = "Pepe";

        pepa.render();
    }
}
