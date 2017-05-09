/*// Kari Johnson
// CWEB 1111
// 7d from chap. 10, practice

/* Design an application that declares an array of 10 Pizza objects.  Prompt the user for a topping and a diameter for each Pizza, and pass each object to a method that computes the price and returns  the complete Pizza object to the main program.  Then display all the Pizza values.  A 12-inch pizza is $13.99, a 14-inch pizza is 16.99, and a 15-inch pizza is $19.99.  Any other entered size is invalid and should cause the price to be set at 0.   */ 

//----------------------------------------------------

// package pizza.app.proj.pkg8;

import java.util.Scanner;



private static double calcPrice(String passedPizzaSize)       // working method,  what to pass in??
{
	// DECLARATIONS
		double SMALL = 13.99;
		double MED = 16.99;
		double LARGE = 19.99;
		double price;
		
		if (passedPizzaSize.equals("s") || passedPizzaSize.equals("S")) // THEN
                {
			price = SMALL;
                }
                else if (passedPizzaSize.equals("m") || passedPizzaSize.equals("M")) // THEN
                {
			price = MEDIUM;
                }
		else 
                 {
			price = LARGE;
                }
	return price;	
	
} // ENDCLASS 

//---------------------------------------------------


//---------------------------------------------------

public String houseKeeping()   // add static?
	// DECLARATIONS
		String start;

                Scanner readIn = new Scanner(System.in);
		
		system.out.println("Welcome to Pizza Nea's Website!  This application will calculate the price of your pizza.");
		system.out.println("Our pizzas come in small (12 inch) medium (14 inch) and large (16 inch) sizes.");
		system.out.println("Please enter a "s," "m," or "l" to indicate the size desired, or enter "z" to exit the program.");
		INPUT start
			while (start != "s" && start != "S" && start != "m" and start != "M" && start != "l" && start != "L" && "z" && start != "Z" THEN
{
                        system.out.println("Invalid entry. Please enter a "s," "m," or "l" to indicate the size desired, or enter "z" to exit the program.";	
				INPUT start
}//  ENDWHILE
return start;

//-------------------------------------------------

public static void conclude(Pizza pizzaArray[], num SIZE)
	int x = 0;
	
	while (x < SIZE)
        {
		system.out.println("Pizza # " + x + 1 + " is a " + pizzaArray[x].getPizzaSize() + " and it has " + pizzaAyyar[x].getPizzaTopping() + " and it costs " + pizzaArray[x].getCustPrice();
		x++;
        } // ENDWHILE
return; 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.app.proj.pkg8;

/**
 *
 * @author johkard
 */
public class PizzaAppProj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
// START  
	// DECLARATIONS
		int SIZE = 10;
		Pizza tenPizzas[SIZE];
		int x = 0;
		String EXIT = "z";
		String start;
		String topping;
		
		start = houseKeeping();
		while (!start.equals(EXIT) && x < 10)  //  how to do != in Java, for a String (whch is an object, notice capital letter))
                {
			Pizza pizzaObject     // declaring new variable inside loop so that it clears, is NEW and empty each time
			pizzaObject.setPizzaSize(start)   //use variable attached to what user entered
			system.out.println("Please enter your single topping choice.");
			INPUT topping
			pizzaObject.setTopping(topping)  //  use variable attached to what user entered
			tenPizzas[x] = pizzaObject     // populating array
			start = houseKeeping()         // getting new user input
			x++;
                } // ENDWHILE
		conclude(tenPizzas, SIZE);		
		
// STOP
 
        
        
        
        
    }
    
}
