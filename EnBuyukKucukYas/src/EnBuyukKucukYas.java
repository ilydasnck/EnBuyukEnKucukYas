
import java.util.Scanner;
import java.util.Arrays;

//Klavyeden girilen 10 yaşın en büyüğünü ve en küçüğünü yazdırır
public class EnBuyukKucukYas {

	public static void main(String[] args) {
		int yaslar[] = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1 + ". kişinin yaşını gir:");
			Scanner input = new Scanner(System.in);
			int yas = input.nextInt();
			yaslar[i] = yas; // Diziye eleman ekleme

		}

		Arrays.sort(yaslar); //küçükten büyüğe sıralama

		System.out.println("En büyük yaştaki " + yaslar[9] + " yaşında");
		System.out.println("En küçük yaştaki " + yaslar[0]+ " yaşındadır");

	}
	
	

}
