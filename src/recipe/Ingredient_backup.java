/*

Felix Chow
IT511 Object Oriented App Development
Module Four Homework

For your Final Project, adapt your Ingredient java file to include
data type validation steps for each of the variables in the class:

ingredientName (String)
ingredientAmount (float)
unitMeasurment (String)
number of Calories (double)

*/

package recipe;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * 
 */
public class Ingredient_backup {
    
    public static void main(String[] args) {
        
        // Declare variables
        Scanner scnr = new Scanner(System.in);
        String recipeName = "";
        ArrayList<String> ingredientList = new ArrayList();
        String newIngredient = "";
        boolean addMoreIngredients = false;

        // Prompt user input for recipe name.
        System.out.println("Please enter the recipe name: ");
        recipeName = scnr.nextLine();
        
        // Enter do-while loop.

        do {
            // Ask user if they want to enter an ingredient. Prompt "y" for "yes" or "n" for "no".
            System.out.println("Would you like to enter an ingredient: (y or n)");
            String reply = scnr.next().toLowerCase();

            /**
             * Add your code here (branches work well!). The code should check
             * the reply: "y" --> prompt for the ingredient and add it to the
             * ingredient list; "n" --> break out of the loop; (Hint: what is
             * the 'while' condition? What could you change to stop the loop
             * from starting over?) anything else --> prompt for a "y" or "n"
             *
             */
            
            // If the user replies "y" for yes, prompt for the ingredient.
            if (reply.equals("y")) {
                System.out.println("Please enter the ingredient: ");
                
                // Assign user input into variable newIngredient.
                newIngredient = scnr.next();
                
                // Add new ingredient to ingredientList ArrayList.
                ingredientList.add(newIngredient);

            // else if the user replies "n" for "no", break out of the loop.
            } else if (reply.equals("n")) {
                break;
            
            // else if the reply is anything else, ask for a yes or no response. Repeat the above conditional statements.
            } else {
                System.out.println("Please enter 'y' for yes or 'n' for no: ");
                reply = scnr.next().toLowerCase();
                
                if (reply.equals("y")) {
                    System.out.println("Please enter the ingredient: ");
                    newIngredient = scnr.next();
                    
                } else if (reply.equals("n")) {
                    break;
                }
            }

        } while (addMoreIngredients);

        // Enter for loop.
        for (int i = 0; i < ingredientList.size(); i++) {
            
            /**
             * Get the item i from the ingredient list and assigning it to the
             * String ingredient
             *
             */

            // Assign String variable ingredient to newIngredient.
            String ingredient = newIngredient;
            
            // Print out the newly added ingredient.
            System.out.println(ingredient);
            
            
        }
    }
}