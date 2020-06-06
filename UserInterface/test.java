import java.util.Scanner;
 
public class UserInterface {
 
    private Scanner scan;
    private Class object;
 
    public UserInterface(Scanner scan, Class object) {
        this.scan = scan;
        this.object = object;
    }
 
    public void start() {
 
        while (true) {
            String command = askUserInput("?");
 
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                add();
            } else if (command.equals("Observation")) {
                observation();
            } else if (command.equals("One")) {
                printOne();
            } else if (command.equals("All")) {
                printAll();
            } else {
                System.out.println("Unknown command!");
            }
        }
    }
 
    public String askUserInput(String prompt) {
        System.out.print(prompt + " ");
        return scan.nextLine();
    }
 
    public void add() {
        String name = askUserInput("Name:");
        String nameInLatin = askUserInput("Name in Latin:");
 
        object.add(name, nameInLatin);
    }
 
    public void observation() {
        String name = askUserInput("Name:");
 
        boolean wasSuccessfull = object.observation(name);
        if (!wasSuccessfull) {
            System.out.println(name + "not valid!");
        }
    }
 
    public void printOne() {
        String name = askUserInput("Name:");
        String birdToPrint = object.getOne(name);
        if (birdToPrint == null) {
            System.out.println(name + " is not valid!");
        } else {
            System.out.println(birdToPrint);
        }
    }
 
    public void printAll() {
        System.out.print(object.getAll());
    }
 
}
