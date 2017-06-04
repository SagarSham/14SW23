/**
 * The <code>SagarMath</code> class represents mathematically equations.
 * It's a simple factorial program of a number that is to be assigned in the variable.
 * @author Sagar Sham - 14SW23
 * @since JDK1.8
 */

public class SagarMath {
	/** These values are used for equation variable storage. */
	private int number;
	private int factorial = number;
     
	/**
     * Uses the parameter value as number NumFactorial theorem to calculate the value factorial.
     * This method doesn't perform any range checking.
     * Parameter is used for multiple multiplications using a for loop
     * loop iterates for 'number' times
	 * returns the value of factorial of the number using this theorem
     */
	
	public float NumFactorial(number) {
        for(int i =(this.number - 1); i > 1; i--)
        {
            this.factorial = this.factorial * i;
        } 
	    return this.factorial;
	}
}