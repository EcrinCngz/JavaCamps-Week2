package oop1;

public class methods {

	public static void main(String[] args) {
		numberfind();
		numberfind();
		numberfind();

	}

	public static void numberfind() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };

		int search = 5;
		boolean ısThere = false;

		for (int number : numbers) {
			if (number == search) {
				ısThere = true;
				break;
			}
		}
		String message = "";
		if (ısThere) {
			message = "Sayı mevcuttur:" + search;
			sendMessage(message);
		} else {
			sendMessage("Sayı mevcut değildir: " + search);
		}
	}

	// parametreli method
	public static void sendMessage(String message) {
		System.out.println(message);
	}
}