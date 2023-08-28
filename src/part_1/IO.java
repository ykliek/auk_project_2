/* ************************************************************************** */
/*                                                                            */
/*                                                 :       ::    :: ::   ::   */
/*   IO.java                                      :+:      :+    :+ :+  :+    */
/*                                               +:+:+     :+    :+ :+  :+    */
/*   By: ykliek <yurii.kliek@auk.edu.ua>        +#   :+    +#    :+ +#:+      */
/*                                             +#+#+#+#+   +#    +# +# +#     */
/*   Created: 2023/08/28 21:09:36 by ykliek   #+       #+  #+    #+ #+  #+    */
/*   Updated: 2023/08/28 21:09:40 by ykliek  ##         ##  ######  ##   ##   */
/*                                                                            */
/* ************************************************************************** */

package part_1;


import java.util.Scanner;

/**
 * This class demonstrates task 1.4: the use of input/output in Java.
 */
public class IO {
	/**
	 * This is the main method which makes use of input/output.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// Prompt the user for their name
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();

		// Close the scanner as we no longer need it
		scanner.close();

		// Create a personalized greeting
		String greeting = "Hello, " + name + "! Welcome to the Hitchhiker's " +
				"Guide to the Galaxy.";

		// Display the greeting
		System.out.println(greeting);
	}
}
