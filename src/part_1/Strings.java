/* ************************************************************************** */
/*                                                                            */
/*                                                 :       ::    :: ::   ::   */
/*   Strings.java                                 :+:      :+    :+ :+  :+    */
/*                                               +:+:+     :+    :+ :+  :+    */
/*   By: ykliek <yurii.kliek@auk.edu.ua>        +#   :+    +#    :+ +#:+      */
/*                                             +#+#+#+#+   +#    +# +# +#     */
/*   Created: 2023/08/28 21:10:04 by ykliek   #+       #+  #+    #+ #+  #+    */
/*   Updated: 2023/08/28 21:10:06 by ykliek  ##         ##  ######  ##   ##   */
/*                                                                            */
/* ************************************************************************** */

package part_1;


/**
 * This class demonstrates task 1.3: the use of strings in Java.
 */
public class Strings {
	/**
	 * This is the main method which makes use of strings.
	 * @param args Unused.
	 */
	public static void main (String[] args) {
		String sentence = "The Hitchhiker's Guide to the Galaxy is a comedy " +
				"science fiction series.";

		// Length of the sentence
		int length = sentence.length();
		System.out.println("Length of the sentence: " + length);

		// Extracting a substring
		String subString = sentence.substring(4, 16);
		System.out.println("Substring: " + subString);

		// Checking if the sentence contains a specific word
		boolean containsGuide = sentence.contains("Guide");
		System.out.println("Contains 'Guide': " + containsGuide);

		// Replacing characters
		String replacedSentence = sentence.replace(
				"comedy",
				"hilarious"
		);
		System.out.println("Replaced sentence: " + replacedSentence);

		// Concatenating strings
		String additionalInfo = " It was written by Douglas Adams.";
		String completeSentence = sentence + additionalInfo;
		System.out.println("Complete sentence: " + completeSentence);
	}
}
