import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // get the user input and whether he wants mac or windows then he can create any object in same type
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your preference (m: Mac / w: Windows): ");
        String preference = scanner.nextLine().trim().toLowerCase();

        GUIFactory gui;

        if (preference.equals("w")) {
            gui = new WindowsFactory();
        } else {
            gui = new MacFactory();
        }

        Renderable btn = gui.createButton();
        btn.render();
        Renderable menu = gui.createMenu();
        menu.render();

        // close the scanner
        scanner.close();
    }
}