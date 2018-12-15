/*
 * Felix Chow
 * IT511 Object Oriented App Development
 * Module 9 Final Project RecipeBox Class
 */
package SteppingStones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author snhu.edu
 */
public class ChowFelix_SteppingStone6_RecipeBox_FinalProject {

    // Declare variable. 
	private ArrayList<ChowFelix_SteppingStone5_Recipe_FinalProject> listOfRecipes;

    /**
     * Declare instance variables: a private ArrayList of the type
     * SteppingStone5_Recipe named listOfRecipes
     *
     */
    
    // Create setter and getter methods.
    public ArrayList<ChowFelix_SteppingStone5_Recipe_FinalProject> getListOfRecipes() {
        return listOfRecipes;
    }

    public void setListOfRecipes(ArrayList<ChowFelix_SteppingStone5_Recipe_FinalProject> listOfRecipes) {
        this.listOfRecipes = listOfRecipes;
    }

    /**
     * Add accessor and mutator for listOfRecipes
     *
     */
    
    // Create constructors.
    
    public ChowFelix_SteppingStone6_RecipeBox_FinalProject(ArrayList<ChowFelix_SteppingStone5_Recipe_FinalProject> listOfRecipes) {
        this.listOfRecipes = listOfRecipes;
    }
    
    public ChowFelix_SteppingStone6_RecipeBox_FinalProject() {
        this.listOfRecipes = new ArrayList<>();
    }

    /**
     * Add constructors for the SteppingStone6_RecipeBox()
     *
     */
    /**
     * Add the following custom methods:
     *
     * //printAllRecipeDetails(SteppingStone5_Recipe selectedRecipe) This
     * method should accept a recipe from the listOfRecipes ArrayList recipeName
     * and use the SteppingStone5_Recipe.printRecipe() method to print the
     * recipe
     *
     * //printAllRecipeNames() <-- This method should print just the recipe
     * names of each of the recipes in the listOfRecipes ArrayList
     *
     * //addRecipe(SteppingStone5_Recipe tmpRecipe) <-- This method should use
     * the SteppingStone5_Recipe.addRecipe() method to add a new
     * SteppingStone5_Recipe to the listOfRecipes
     *
     * @param selectedRecipe
     */
    
    // Create printAllRecipeDetails() function that takes in a String as an argument.
    public void printAllRecipeDetails(String selectedRecipe) {
        
        // Call printRecipe() function from SteppingStone5_Recipe.
    	
    	for (ChowFelix_SteppingStone5_Recipe_FinalProject recipe : listOfRecipes) {
            if (recipe.getRecipeName().equalsIgnoreCase(selectedRecipe)) {
                recipe.printRecipe();
                return;
            }
    	}
       System.out.println("No Recipe found with name: " + selectedRecipe);
    }

    // Create printAllRecipeNames() function to print recipe name.
    void printAllRecipeNames() {
    	for (ChowFelix_SteppingStone5_Recipe_FinalProject selectedRecipe:listOfRecipes) {
    		System.out.println(selectedRecipe.getRecipeName());
    	}
    }
    
    // Create addNewRecipe() function that takes a classname as an argument.
    public void addNewRecipe(ChowFelix_SteppingStone5_Recipe_FinalProject tmpRecipe) {
        
        // Add the new recipe to the listOfRecipes ArrayList.
        listOfRecipes.add(tmpRecipe);
    }

    /**
     * A variation of following menu method should be used as the actual main
     * once you are ready to submit your final application. For this submission
     * and for using it to do stand-alone tests, replace the public void menu()
     * with the standard public static main(String[] args) method
     *
     */
    public static void main(String[] args) {
        // Create a Recipe Box

        ChowFelix_SteppingStone6_RecipeBox_FinalProject myRecipeBox = new ChowFelix_SteppingStone6_RecipeBox_FinalProject(); //Uncomment for main method
        // initialize Scanner function for user input
//        Scanner scnr = new Scanner(System.in);
        Scanner menuScnr = new Scanner(System.in);

        /**
         * Print a menu for the user to select one of the three options:
         *
         */
        System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
        while (menuScnr.hasNextInt() || menuScnr.hasNextLine()) {
            int input = menuScnr.nextInt();

            /**
             * The code below has two variations: 1. Code used with the
             * SteppingStone6_RecipeBox_tester. 2. Code used with the public
             * static main() method
             *
             * One of the sections should be commented out depending on the use.
             */
            /**
             * This could should remain uncommented when using the
             * SteppingStone6_RecipeBox_tester.
             *
             * Comment out this section when using the public static main()
             * method
             */
//			if (input == 1) {
//                newRecipe();
//            } else if (input == 2) {
//                System.out.println("Which recipe?\n");
//                String selectedRecipeName = menuScnr.next();
//                printAllRecipeDetails(selectedRecipeName);
//            } else if (input == 3) {
//                
//				
//				for (int j = 0; j < listOfRecipes.size(); j++) { 
//                    System.out.println((j + 1) + ": " + listOfRecipes.get(j).getRecipeName()); 
//                }
//            } else {
//                System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print Recipe\n" + "3. Adjust Recipe Servings\n" + "\nPlease select a menu item:");
//            }
            /**
             * This could should be uncommented when using the public static
             * main() method
             *
             * Comment out this section when using the
             * SteppingStone6_RecipeBox_tester.
             *
             *
             */
            
            // If user inputs 1, call the addNewRecipe() function.
            if (input == 1) {
                myRecipeBox.recipe1();
                
            // Else if the user inputs 2, prompt the user for the recipe name, and print the selected recipe.
            } else if (input == 2) {
                System.out.println("Which recipe?\n");
                String selectedRecipeName = menuScnr.next();
                
                myRecipeBox.printAllRecipeDetails(selectedRecipeName);
            // Else if the user inputs 3, call the getRecipeName() function.
            } else if (input == 3) {
            	for (int j = 0; j < myRecipeBox.listOfRecipes.size(); j++) {

                    System.out.println((j + 1) + ": " + myRecipeBox.listOfRecipes.get(j).getRecipeName());

                }

                    // Else if user input is anything beyond 1, 2, and 3, prompt for the user again.
            } else {
                System.out.println("\n********************\n");
                System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print Recipe\n" + "3. Adjust Recipe Servings\n" + "\nPlease select a menu item:");
            }

            System.out.println("\n********************\n");
            System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
        }

    }
    
    public void recipe1() {
    	// declare and initialize variables
        int totalRecipeCalories = 0;
        ArrayList <String> recipeIngredients = new ArrayList();
        boolean addMoreIngredients = true;

        // initialize Scanner function for user input
        Scanner scnr = new Scanner(System.in);

        // declare String ingredientName
        String ingredientName;

        // prompt user for recipe name
        System.out.println("Please enter the recipe name: ");
        String recipeName = scnr.nextLine();

        // prompt user for number of servings
        System.out.println("Please enter the number of servings: ");
        //correct data type & Scanner assignment method for servings variable
        int servings = scnr.nextInt();

        // enter do-while loop
        do {

            // prompt user for ingredient name or ask them to type "end" if they are finished entering ingredients
            System.out.println("Please enter the ingredient name or type end if you are finished entering ingredients: ");
            ingredientName = scnr.next();

            // add ingredient name into recipeIngredients
            recipeIngredients.add(ingredientName);

            // if user inputs "end", exit the loop
            if (ingredientName.toLowerCase().equals("end")) {
                addMoreIngredients = false;
                
                System.out.println("Here's your recipe: ");
                System.out.println("====================");
                System.out.println("Recipe: " + recipeName);
                System.out.println("Servings: " + servings);

                for (int i = 0; i < recipeIngredients.size(); i++) {
                    System.out.println("Ingredients: " + recipeIngredients.get(i));
                }
                
            } else {

            /**
            * Add the ingredient name to recipeIngredients
            *
            */
                       

                // else, prompt for ingredient amount
                System.out.println("Please enter the ingredient amount: ");
                float ingredientAmount = scnr.nextFloat();
                
                // prompt for ingredient calories
                System.out.println("Please enter the ingredient Calories: ");
                int ingredientCalories = scnr.nextInt();

                /**
                * Add the total Calories from this ingredient
                *  (ingredientCalories * ingredientAmount)
                * to the totalRecipeCalories
                *
                */

                // calculate totalRecipeCalories
                totalRecipeCalories = (int)(ingredientCalories * ingredientAmount);


            }

            // when ingredientName does not equal "end"
       } while (addMoreIngredients);

        ChowFelix_SteppingStone5_Recipe_FinalProject recipe1 = new ChowFelix_SteppingStone5_Recipe_FinalProject(recipeName,
            servings, recipeIngredients, totalRecipeCalories);

            // call addNewRecipe() function
        addNewRecipe(recipe1);
    }

}
