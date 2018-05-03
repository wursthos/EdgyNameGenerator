import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "x";

		System.out.println("Welcome to the Edgy-Name-Generator");
		System.out.println("-------------------------------------------");

		while (!input.equals("exit")) {
			System.out.println("Insert a command (\"info\" for info)");

			//Check for empty input to repeat last
			String in = scan.nextLine();
			if (!(in.equals(""))) {
				input = in;
			}

			if (!(input.equals("info") || input.equals("normal") || input.equals("fucked") || input.equals("exit"))) {
				System.out.println("Please insert a valid command");
				System.out.println("-------------------------------------------");
			}

			if (input.equals("info")) {
				System.out.println("normal (A kinda normal edgy name)");
				System.out.println("fucked (A really fucked up name)");
				System.out.println("exit (Exit the program)");
				System.out.println("-------------------------------------------");
			}

			if (input.equals("normal")) {
				System.out.print("You shall now be called: ");
				System.out.println(Generators.normal());
				System.out.println("-------------------------------------------");
				System.out.println("Desire another name?");
			}
			if (input.equals("fucked")) {
				System.out.print("You shall now be called: ");
				System.out.println(Generators.fucked());
				System.out.println("-------------------------------------------");
				System.out.println("Desire another name?");
			}
		}
		scan.close();
		System.exit(0);
	}
}