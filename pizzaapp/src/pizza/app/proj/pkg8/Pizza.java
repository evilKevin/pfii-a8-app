/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.app.proj.pkg8;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author johkard
 */
// @Entity
public class Pizza 
{
    private String topping;
    private String pizzaSize;     // S, M or L for 12 inch, SMALL = 13.99, 14 inch, MEDIUM = 16.99, and 15 inch, LARGE = 19.99 
    private double price;
    
    // ----------------------------------------
                    
	public void setTopping(String custTopping)
        {
		topping = custTopping;
        }
	
	public void setPizzaSize(String custPizzaSize)
        {
            pizzaSize = custPizzaSize;
        }
	
	public void setPrice(double custPrice)
        {
		price = custPrice;
        }
	
//---------------------------------------------------
	
	
	public String getTopping()
        {
	return topping;
        }
	
	public String getPizzaSize()
        {
	return pizzaSize;
        }
	
	public double getCustPrice()
        {
		price = calcPrice(pizzaSize);
	return price;
        }
	
//----------------------------------------------------

    private static double calcPrice(String passedPizzaSize)       // working method,  what to pass in??
    {// DECLARATIONS
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
                            price = MED;
                    }
                    else 
                    {
                            price = LARGE;
                            }
            return price;	

    } // end of private method cacl price
    
}// ENDCLASS 
