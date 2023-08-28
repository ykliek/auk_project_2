/* ************************************************************************** */
/*                                                                            */
/*                                                 :       ::    :: ::   ::   */
/*   Variables.java                               :+:      :+    :+ :+  :+    */
/*                                               +:+:+     :+    :+ :+  :+    */
/*   By: ykliek <yurii.kliek@auk.edu.ua>        +#   :+    +#    :+ +#:+      */
/*                                             +#+#+#+#+   +#    +# +# +#     */
/*   Created: 2023/08/28 19:59:50 by ykliek   #+       #+  #+    #+ #+  #+    */
/*   Updated: 2023/08/28 19:59:52 by ykliek  ##         ##  ######  ##   ##   */
/*                                                                            */
/* ************************************************************************** */

package part_1;

/**
 * This class demonstrates task 1.1: the use of variables in Java.
 */
public class DataTypes {
	/**
	 * This is the main method which makes use of variables.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		double	cats = 3.14;
		int		dogs = 2;
		char	letter = 'G';
		boolean	carriesUmbrella = true;
		String	name = "Arthur Dent";

		// Print the variables
		System.out.printf(
				"As I was strolling down the lane, I saw %.2f cats, %d dogs, " +
						"'%c' as my favorite letter, I am carrying an " +
						"umbrella (%b), and my name is %s.%n",
			cats, dogs, letter, carriesUmbrella, name);
	}
}
