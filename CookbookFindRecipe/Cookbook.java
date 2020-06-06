
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class Cookbook {
    
    private ArrayList<Recipes> recipes;
    
    public Cookbook(){
        this.recipes = new ArrayList<>();
    }
    
    public void addRecipe(String title, int cookingTime) {
        
        Recipes newRecipe = new Recipes(title,cookingTime);
        recipes.add(newRecipe);
    }
    
    public void print() {
        for (Recipes recipe:recipes) {
            System.out.println(recipe);
        }
    }
    
    public void find(String name){
        for (Recipes recipe:recipes) {
            if (recipe.getTitle().contains(name)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void maxTime(int time) {
        for (Recipes recipe:recipes) {
            if (time >= recipe.getTime()) {
                System.out.println(recipe);
            }
        }
    }
    
    public void addNewIngredient(String ingredient,int index) {
        recipes.get(index).addIngredients(ingredient);
    }
    
    public void ingredientFind(String ingredient) {
        for (Recipes recipe:recipes) {
            if (recipe.getIngredient(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
    
    
}
