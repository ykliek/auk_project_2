/* ************************************************************************** */
/*                                                                            */
/*                                                 :       ::    :: ::   ::   */
/*   HitchhikersChat.java                         :+:      :+    :+ :+  :+    */
/*                                               +:+:+     :+    :+ :+  :+    */
/*   By: ykliek <yurii.kliek@auk.edu.ua>        +#   :+    +#    :+ +#:+      */
/*                                             +#+#+#+#+   +#    +# +# +#     */
/*   Created: 2023/08/28 21:28:01 by ykliek   #+       #+  #+    #+ #+  #+    */
/*   Updated: 2023/08/28 21:28:05 by ykliek  ##         ##  ######  ##   ##   */
/*                                                                            */
/* ************************************************************************** */

package part_2;

import java.util.Scanner;


/**
 * This class demonstrates task 2.1: simple chatbot.
 */
public class HitchhikersChat {
	/**
	 * This is the main method which contains simple logic of the chatbot.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		String	userName;
		Scanner	scanner = new Scanner(System.in);
		boolean	ageValid = false;

		// Log in
		System.out.println("Log In");
		System.out.print("Enter your name: ");
		userName = scanner.nextLine();

		// Validate age
		while (!ageValid) {
			try {
				System.out.print("Enter your age: ");
				int age = scanner.nextInt();
				scanner.nextLine();
				if (age < 1 || age > 150) {
					throw new Exception();
				}
				ageValid = true;
			} catch (NumberFormatException e) {
				System.out.println("Invalid age. Please try again.");
			} catch (Exception e) {
				System.out.println("Invalid age. Please try again.");
			}
		}

		System.out.println("Hello, " + userName + "! Welcome to the " +
				"Hitchhiker's Chat!");
		System.out.println("What do you want to ask me? (type 'exit' to quit)");

		// Chat
		while(true) {
			System.out.print(userName + ": ");
			String message = scanner.nextLine();

			// Exit the chat
			if(message.equals("exit")) {
				System.out.println("Goodbye! Have a froody day.");
				scanner.close();
				break;
			}

			// Generate a response
			String response = generateResponse(message);
			System.out.println("Marvin: " + response);
		}
	}

	/**
	 * This method generates a response to the user's input.
	 * @param input The user's input.
	 * @return The response to the user's input.
	 */
	private static String generateResponse(String input) {
		String response = "";

		if(input.equals("Hello")) {
			response = "Hello, " + input + "! Welcome to the Hitchhiker's Chat!";
		} else if(input.equals("How are you?")) {
			response = "I'm fine, thanks. And you?";
		} else if(input.equals("I'm fine, thanks.")) {
			response = "I'm fine too, thanks.";
		} else if(input.equals("What is your name?")) {
			response = "My name is Marvin.";
		} else if(input.contains("meaning of life")) {
			response = "The Answer to the Ultimate Question of Life, the " +
					"Universe, and Everything is 42.";
		} else if (input.contains("hitchhiking essentials")) {
			return "While hitchhiking through the galaxy, make sure you have " +
					"your trusty towel, a copy of the Hitchhiker's Guide to " +
					"the Galaxy, and a good sense of humor.";
		} else {
			response = "I'm sorry, but I can't quite grasp that concept at " +
					"the moment.";
		}

		return response;
	}
}
