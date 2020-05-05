package application;


/**
 * @author Nathanael Yao
 * NetId: 18ny13
 * February 27 2020
 * This is the exception class that is used for illegal pizzas.
 *
 */
public class IllegalPizza extends Exception {
	/**
	 * gives an exception message
	 * 
	 * @param message (the message passed)
	 */
	public IllegalPizza(String message) {
		super(message);
	}
}
