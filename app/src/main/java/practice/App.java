/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package practice;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public String getName(){
        return "CSC210.";
    }

    public String getFarewell(){
        return "Goodbye World";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println(new App().getName());
        System.out.println(new App().getFarewell());
    }
}
