package oop1;

public class miniProje5numberfind {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };

		int search = 5;
		boolean ısThere = false;

		for (int number : numbers) {
			if (number == search) {
				ısThere = true;
				break;
			}
		}

		if (ısThere) {
			System.out.println("Sayı mevcuttur.");
		} else {
			System.out.println("Sayı mevcut değildir.");
		}
	}

}
