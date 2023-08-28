/* ************************************************************************** */
/*                                                                            */
/*                                                 :       ::    :: ::   ::   */
/*   Comments.java                                :+:      :+    :+ :+  :+    */
/*                                               +:+:+     :+    :+ :+  :+    */
/*   By: ykliek <yurii.kliek@auk.edu.ua>        +#   :+    +#    :+ +#:+      */
/*                                             +#+#+#+#+   +#    +# +# +#     */
/*   Created: 2023/08/28 21:09:12 by ykliek   #+       #+  #+    #+ #+  #+    */
/*   Updated: 2023/08/28 21:09:14 by ykliek  ##         ##  ######  ##   ##   */
/*                                                                            */
/* ************************************************************************** */

package part_1;


/**
 * This class demonstrates task 1.5: the use of comments in Java.
 */
public class Comments {
	/**
	 * This is a method which returns 1.
	 * @return 1
	 */
	private static int returnOne() {
		// This is a single-line comment
		return 1;
	}

	/**
	 * This is the main method which makes use of comments.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		/*
		 * This is a multi-line comment
		 */
		System.out.println("This is a comment: " + returnOne());
	}
}
