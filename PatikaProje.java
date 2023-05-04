import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("1. Sayıyı giriniz: ");
		int sayi1 = input.nextInt();
		System.out.print("2. Sayıyı giriniz: ");
		int sayi2 = input.nextInt();
		
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		System.out.print("Seçiminiz: ");
		int secim = input.nextInt();
		
		switch(secim) {
			case 1:
				System.out.println("Toplam: " + (sayi1 + sayi2));
				break;
			case 2:
				System.out.println("Fark: " + (sayi1 - sayi2));
				break;
			case 3:
				System.out.println("Çarpım: " + (sayi1 * sayi2));
				break;
			case 4:
				switch(sayi2) {
					case 0:
						System.out.println("Bir sayı 0'a bölünemez !");
						break;
					default:
						System.out.println("Bölüm: " + (sayi1 / sayi2));
				}
				break;
			default:
				System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");
		}
	}

}
