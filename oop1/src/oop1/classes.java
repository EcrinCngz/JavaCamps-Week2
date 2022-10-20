package oop1;

public class classes {

	public static void main(String[] args) {
		customerManager customerManager = new customerManager();
		customerManager customerManager2 = new customerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		// value
		int sayı1 = 10;
		int sayı2 = 20;
		sayı2 = sayı1;
		sayı1 = 30;
		System.out.println(sayı2);

		int[] sayılar1 = new int[] { 1, 2, 3 };
		int[] sayılar2 = new int[] { 4, 5, 6 };
		sayılar2 = sayılar1;
		sayılar1[0] = 10;
		System.out.println(sayılar2[0]);
	}
}
