
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
public class Recipes {
    
    private String title;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipes(String title,int cookingTime) {
        this.title = title;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getTime() {
        return this.cookingTime;
    }
    
    public boolean getIngredient(String search){
        for (String ingredient: ingredients) {
            if (ingredient.equals(search)) {
                return true;
            }
        }
        return false;
    }
    
    public void addIngredients(String ingredient) {
        
        ingredients.add(ingredient);
    }
    
    @Override
    public String toString() {
        return this.title + ", cooking time: " + this.cookingTime;
    }
}
