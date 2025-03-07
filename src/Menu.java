
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    private int option;

    public Menu() {
        super();
    }

    /**
     * Menu visual per el menu principal, aquí permet que l'usuari esculli de les diferents opcions que permet realitzar
     * a la base de dades.
     */

    public int mainMenu() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {

            System.out.println(" \nMENU PRINCIPAL \n");

            System.out.println("1. Mostrar totes les espècias.");
            System.out.println("2. Mostrar espècia per països.");
            System.out.println("3. Mostrar espècia per cuina.");
            System.out.println("4. Mostrar espècia per format.");
            System.out.println("5. Insertar nova espècia.");
            System.out.println("6. Esborrar per nom.");
            System.out.println("7. Modifica el nom d'una espècia existent.");
            System.out.println("8. Eliminar espècia per països.");
            System.out.println("9. Eliminar espècia per format.");
            System.out.println("10. Modificar per nom qualsevol camp d'una espècia.");
            System.out.println("0. Sortir. ");

            System.out.println("Esculli opció: ");
            try {
                option = Integer.parseInt(br.readLine());
            } catch (NumberFormatException | IOException e) {
                System.out.println("valor no vàlid");
                e.printStackTrace();
            }
        } while (option < 0 && option > 10);

        return option;
    }






}