import java.util.Random;

public class Generators {
	public static String normal() {
		String[] all = Components.getAll();
		String[] first = Components.getFirst();
		String[] second = Components.getSecond();

		String[] partOne = new String[all.length + first.length];
		String[] partTwo = new String[all.length + second.length];

		//Merge strings
		int countOne = 0;
		for (int i = 0; i < all.length; ++i) {
			partOne[i] = all[i];
			partTwo[i] = all[i];
			++countOne;
		}
		int countTwo = countOne;
		for (int j = 0; j < first.length; ++j) {
			partOne[countOne++] = first[j];
		}
		for (int k = 0; k < second.length; ++k) {
			partTwo[countTwo++] = second[k];
		}

		//Merge Name
		String name = partOne[new Random().nextInt(partOne.length)] + partTwo[new Random().nextInt(partTwo.length)];

		//Capitalize first letter
		String returnname = name.substring(0, 1).toUpperCase() + name.substring(1);

		return returnname;
	}

	public static String fucked() {
		String[] all = Components.getAll();
		String[] first = Components.getFirst();
		String[] second = Components.getSecond();

		String[] part = new String[all.length + first.length + second.length];

		//Merge strings
		int count = 0;
		for (int i = 0; i < all.length; ++i) {
			part[i] = all[i];
			++count;
		}
		for (int j = 0; j < first.length; ++j) {
			part[count++] = first[j];
		}
		for (int k = 0; k < second.length; ++k) {
			part[count++] = second[k];
		}

		//Merge Name
		String name = part[new Random().nextInt(part.length)] + part[new Random().nextInt(part.length)];

		//Capitalize first letter
		String returnname = name.substring(0, 1).toUpperCase() + name.substring(1);

		return returnname;
	}
}