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
        Person pepa = new Person("Pepa", "Anónima", "00112233G", 1956, "USA", "M");
        Person caillou = new Person("Caillou", "Somewhere", "99887766H", 2004, "France", 'H');
        pepa.name = "Caillou";
        pepa.printPersonInfo();
        System.out.println("---------------------------------");
        caillou.printPersonInfo();

        pepa.render();
   
    }
}
