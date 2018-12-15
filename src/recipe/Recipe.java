/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipe;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author snhu.edu
 */

public class Recipe {

	String recipeName = "";
    int servings;
    ArrayList<String> recipeIngredients = new ArrayList();
    double totalRecipeCalories = 0;

    /**
     * Add three variables:
     *
     * 1. a variable 'servings' to store how many people the recipe will feed;
     *
     * 2. an ArrayList variable 'recipeIngredients' to store the text for the
     *      names (recipeName) each recipe ingredient added
     *
     * 3. a variable totalRecipeCalories
     *
     */


    /**
     * Add mutators and accessors for the class variable.
     *
     */

    // Create Recipe constructor
    
    public Recipe() {
        this.recipeName = "";
        this.servings = 10; //<--- assignment value with appropriate data type
        this.recipeIngredients = recipeIngredients; //<-- assignment value for empty ArrayList
        this.totalRecipeCalories = 0;

    }
   
    
    // Create second Recipe constructor
    
    public Recipe(String recipeName, int servings,
    	ArrayList<String> recipeIngredients, ArrayList<String> recipeInstructions, String unitMeasurement, double totalRecipeCalories)
    //<-- use appropriate data type for the ArrayList and the servings arguments
    {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients;
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
    // Create setters and getters.
    public String getRecipeName(){
        return recipeName;
    }
    
    public void setRecipeName(String recipeName){
        this.recipeName = recipeName;
    }
    
    public int getServings(){
        return servings;
    }
    
    public void setServings(int servings){
        this.servings = servings;
    }
    
    public ArrayList<String> getRecipeIngredients(){
        return recipeIngredients;
    }
    
    public void setRecipeIngredients(ArrayList<String> recipeIngredients){
        this.recipeIngredients = recipeIngredients;
    }
    
    public double getTotalRecipeCalories(){
        return totalRecipeCalories;
    }
    
    public void setTotalRecipeCalories(double totalRecipeCalories){
        this.totalRecipeCalories = totalRecipeCalories;
    }
        
    // Create printRecipe() function
    public void printRecipe() {

//        /**
//         * Declare an int variable singleServingCalories.
//         * Assign singleServingCalories to
//         * the totalRecipeCalories divided by the servings
//         *
//         */
//
  
      // Iterate recipe ingredients through for loop to display ingredients.
       for (int i = 0; i < recipeIngredients.size(); i++) {
         String ingredientName = "";
         System.out.println("Ingredients: " + ingredientName);
       }

//        /**
//         * Print the following recipe information:
//         *      Recipe: <<recipeName>>
//         *      Serves: <<servings>>
//         *      Ingredients:
//         *      <<Ingredient1>>
//         *      <<Ingredient2>>
//         *      ...
//         *      <<Last Ingredient>>
//         *
//         *      Each serving has <<singleServingCalories>> Calories.
//         *
//         *      HINT --> Use a for loop to iterate through the ingredients
//         */
    }
    
    /*
    Psuedocode for printRecipeInstructions() method:
    
    public void printRecipeInstructions() {
        DECLARE recipeInstructions ArrayList.
        INITIALIZE addMoreInstructions boolean to true.
    
        INITIALIZE Scanner function for user input.
        
        DO
            PROMPT user input for recipe instructions.
            ASSIGN user input to instructions variable.
            ADD instructions to recipeInstructions ArrayList.
    
            IF user input for instructions is equal to "end",
                ASSIGN addMoreInstructions to false to exit do-while loop.
        
        WHILE instructions does not equal "end", keep the loop going.
        
    }
    */
    
    public void createNewRecipe(){
    	// Initialize variables.
    	
        int totalRecipeCalories = 3;
        ArrayList <String> recipeIngredients = new ArrayList();

        boolean addMoreIngredients = true;

        // Initialize Scanner function for user input.
        
        Scanner scnr = new Scanner(System.in);
        String ingredientName;

        // Prompt user for recipe name.
        System.out.println("Please enter the recipe name: ");
        String recipeName = scnr.nextLine();
                        
        // Prompt user for number of servings.
        System.out.println("Please enter the number of servings: ");
        //correct data type & Scanner assignment method for servings variable
        int servings = scnr.nextInt();
        
     // Initialize singleServingCalories.
        int singleServingCalories = 0;
        
        // Calculate singleServingCalories.
        singleServingCalories = (int)totalRecipeCalories / servings;

          /**
           * Declare an int variable singleServingCalories.
           * Assign singleServingCalories to
           * the totalRecipeCalories divided by the servings
           *
           */

        // Catch the new line (\n) input from the user when they input number of servings.
        scnr.nextLine();
        
        // Enter the do-while loop.
        do {
        	         
        	// Prompt user for number of servings.
            System.out.println("Please enter the ingredient name or type end if you are finished entering ingredients: ");
            
            ingredientName = scnr.nextLine();
            
            // Add ingredient names to recipeIngredients ArrayList
            recipeIngredients.add(ingredientName);
            
            // Check if user input equals "end".
            if (ingredientName.toLowerCase().equals("end")) {
              System.out.println("");
              System.out.println("Here's your recipe:");
              System.out.println("===================");
              System.out.println("Recipe name: " + recipeName);
              System.out.println("Servings: " + servings);
              System.out.println("Single serving calories: " + singleServingCalories);
              System.out.println("Total calories: " + totalRecipeCalories);
              
            	// If yes, assign addMoreIngredients to false to exit loop.
                addMoreIngredients = false;
            } else {

            /**
            * Add the ingredient name to recipeIngredients
            *
            */
              
            	// Else prompt for user input
                System.out.println("Please enter the ingredient amount: ");
                float ingredientAmount = scnr.nextFloat();
                
                // Catch the new line (\n) input from the user when they input an ingredient amount.
                scnr.nextLine();
                
                System.out.println("Please enter the ingredient Calories: ");
                int ingredientCalories = scnr.nextInt();
                
                /* Catch the new line (\n) input from the user when they input an ingredient calorie amount.
                 * You can now display multiple words in the recipe instructions.
                 */
                scnr.nextLine();
                
                /**
                * Add the total Calories from this ingredient
                *  (ingredientCalories * ingredientAmount)
                * to the totalRecipeCalories
                *
                */
                
                // Calculate total calories.
                totalRecipeCalories = (int)(ingredientCalories * ingredientAmount);
                

            }

            // While ingredient name is not "end", continue loop.
       } while (!ingredientName.equals("end")) ;
    }
}




/**
 * Final Project
 *
 * For your Final Project:
 *
 * 1. Modify this code to develop a Recipe class:
 *	a. change the void main method createNewRecipe() that returns a Recipe
 *
 * 2. FOR FINAL SUBMISSION ONLY:Change the ArrayList type to an
 *		Ingredient object.  When a user adds an ingredient to the recipe,
 * 		instead of adding just the ingredient name, you will be adding the
 *		actual ingredient including name, amount, measurement type, calories.
 *	For the Milestone Two submission, the recipeIngredients ArrayList can
 *	remain as a String type.
 *
 * 3. Adapt the printRecipe() method to print the amount and measurement
 * 	type as well as the ingredient name.
 *
 * 4. Create a custom method in the Recipe class.
 *      Choose one of the following options:
 *
 * 	a. print out a recipe with amounts adjusted for a different
 * 		number of servings
 *
 * 	b. create an additional list or ArrayList that allow users to
 * 		insert step-by-step recipe instructions
 *
 * 	c. conversion of ingredient amounts from
 * 		English to metric (or vice versa)
 *
 * 	d. calculate select nutritional information
 *
 * 	e. calculate recipe cost
 *
 *      f. propose a suitable alternative to your instructor
 *
 */
