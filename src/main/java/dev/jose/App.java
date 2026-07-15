package dev.jose;

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
        Persona p1 = new Persona("Jose", "Castro", "111111111", 2000);
        System.out.println(p1.toString());
    }
}
