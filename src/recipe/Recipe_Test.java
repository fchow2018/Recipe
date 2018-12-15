package recipe;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TeamTeal2018
 */
public class Recipe_Test {
    
	/**
 	* @param args the command line arguments
 	*/
    
        // declare variables
    
        String recipeName;
        int servings = 0;
        ArrayList<String> recipeIngredients;
        double totalRecipeCalories = 0;
        
        public void Recipe(String recipeName, int servings,
    	ArrayList<String> recipeIngredients, double totalRecipeCalories){
            this.recipeName = recipeName;
            this.servings = servings;
            this.recipeIngredients = recipeIngredients;
            this.totalRecipeCalories = totalRecipeCalories;
        }
        
	public static void main(String[] args) {
            
            // Create a recipe object first
            Recipe myFirstRecipe = new Recipe();
            ArrayList<Ingredient> recipeIngredients = new ArrayList(); 
            myFirstRecipe.createNewRecipe();
            myFirstRecipe.printRecipe();
        }
}
