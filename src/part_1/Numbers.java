/* ************************************************************************** */
/*                                                                            */
/*                                                 :       ::    :: ::   ::   */
/*   Numbers.java                                 :+:      :+    :+ :+  :+    */
/*                                               +:+:+     :+    :+ :+  :+    */
/*   By: ykliek <yurii.kliek@auk.edu.ua>        +#   :+    +#    :+ +#:+      */
/*                                             +#+#+#+#+   +#    +# +# +#     */
/*   Created: 2023/08/28 21:09:50 by ykliek   #+       #+  #+    #+ #+  #+    */
/*   Updated: 2023/08/28 21:09:52 by ykliek  ##         ##  ######  ##   ##   */
/*                                                                            */
/* ************************************************************************** */

package part_1;


/**
 * This class demonstrates task 1.2: the use of numbers in Java.
 */
public class Numbers {
	/**
	 * This is the main method which makes use of numbers.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		int	a = 42;
		int	b = 5;

		// Addition
		int sum = a + b;
		System.out.println("Sum: " + sum);

		// Subtraction
		int difference = a - b;
		System.out.println("Difference: " + difference);

		// Multiplication
		int product = a * b;
		System.out.println("Product: " + product);

		// Division
		double quotient = (double) a / b;
		System.out.println("Quotient: " + quotient);

		// Modulus
		int remainder = a % b;
		System.out.println("Modulus: " + remainder);
	}
}
