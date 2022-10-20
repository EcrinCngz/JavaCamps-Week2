package oop1;

public class methods2 {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5, 7);
		System.out.println(sayi);
		String yeniMesaj1 = mesaj.substring(0, 2);
		System.out.println(yeniMesaj1);
		int toplam = topla2(2, 3, 4, 5, 6, 10);
		System.out.println(toplam);

	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void güncelle() {
		System.out.println("Güncellendi");
	}

	public static int topla(int sayı1, int sayı2) {
		return sayı1 + sayı2;
	}

	// variable arguments
	public static int topla2(int... sayılar) {
		int toplam = 0;
		for (int sayi : sayılar) {
			toplam += sayi;
		}
		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";
	}

}
