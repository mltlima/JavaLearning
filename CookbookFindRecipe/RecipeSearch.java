
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
//        Cookbook recipes = new Cookbook();
        
        System.out.print("File to read: ");
        String name = scanner.nextLine();
        Cookbook recipes = new Cookbook();
        int count = 0;
        int total = -1;
        
        try (Scanner file = new Scanner(Paths.get(name))) {
            while (file.hasNextLine()) {
                if (count == 0) {
                    String line1 = file.nextLine();
                    String line2 = file.nextLine();
                    recipes.addRecipe(line1,Integer.valueOf(line2));
                    total ++;
                    count = 1;
                }
                String line = file.nextLine();
                
                if (line.equals("")) {
                    count = 0;
                }else {
                    recipes.addNewIngredient(line, total);
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            System.out.println("");
        
        while(true) {
            
            System.out.println("");
            System.out.print("Enter command: ");
            //System.out.println("");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("list")) {
                recipes.print();
            }
            
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String nameToFind = scanner.nextLine();
                recipes.find(nameToFind);
            }
            
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int timeToSearch = Integer.valueOf(scanner.nextLine());  
                recipes.maxTime(timeToSearch);
            }
            
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredientToFind = scanner.nextLine(); 
                recipes.ingredientFind(ingredientToFind);
                
            }
        }
        
        

    }
    

}
