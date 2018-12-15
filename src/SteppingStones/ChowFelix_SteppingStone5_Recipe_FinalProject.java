///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package SteppingStones;
//
//import java.util.Scanner;
//import java.util.ArrayList;
//
///**
// *
// * @author snhu.edu
// */
//
//**

/*
Felix Chow
IT511
Stepping Stone 5: Recipe
 */

package SteppingStones;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author snhu.edu
 */

public class ChowFelix_SteppingStone5_Recipe_FinalProject {

    // variable declarations

    private String recipeName;
    private int servings;
    private ArrayList<String> recipeIngredients = new ArrayList();
    private double totalRecipeCalories;

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

     // constructor
    public ChowFelix_SteppingStone5_Recipe_FinalProject() {
        this.recipeName = ""; // assign to empty string
        this.servings = 10; //<--- assignment value with appropriate data type
        this.recipeIngredients = new ArrayList<>(); //<-- assignment value for empty ArrayList
        this.totalRecipeCalories = 0; // initialize totalRecipeCalories to 0

    }

    // constructor with four arguments
    public ChowFelix_SteppingStone5_Recipe_FinalProject(String recipeName, int servings,
    	ArrayList<String> recipeIngredients, double totalRecipeCalories)
    //<-- use appropriate data type for the ArrayList and the servings arguments
    {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients;
        this.totalRecipeCalories = totalRecipeCalories;
    }

    // create getter and setter functions for each variable
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

    // create printRecipe function to print out recipe
    public void printRecipe() {

      // Calculate singleServingCalories.
      int singleServingCalories = (int)totalRecipeCalories / servings;

        /**
         * Declare an int variable singleServingCalories.
         * Assign singleServingCalories to
         * the totalRecipeCalories divided by the servings
         *
         */

      // print out recipe
      System.out.println("Recipe: " + recipeName);
      System.out.println("Servings: " + servings);
      System.out.println("Single serving calories: " + singleServingCalories);

      // loop through recipeIngredients ArrayList and print out ingredients
       for (int i = 0; i < recipeIngredients.size(); i++) {
           System.out.println("Ingredients: " + recipeIngredients.get(i));
       }

        /**
         * Print the following recipe information:
         *      Recipe: <<recipeName>>
         *      Serves: <<servings>>
         *      Ingredients:
         *      <<Ingredient1>>
         *      <<Ingredient2>>
         *      ...
         *      <<Last Ingredient>>
         *
         *      Each serving has <<singleServingCalories>> Calories.
         *
         *      HINT --> Use a for loop to iterate through the ingredients
         */
    }

    public static void main(String[] args) {

      // declare and initialize variables
        double totalRecipeCalories = 0;
        ArrayList <String> recipeIngredients = new ArrayList<String>();
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
       } while (addMoreIngredients) ;

        ChowFelix_SteppingStone5_Recipe_FinalProject recipe1 = new ChowFelix_SteppingStone5_Recipe_FinalProject(recipeName,
            servings, recipeIngredients, totalRecipeCalories);

            // call printRecipe() function
        recipe1.printRecipe();
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
