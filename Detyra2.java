import java.util.Scanner;

public class Detyra3 {

	public static void main(String[] args) {
		//Nje numer i Armstrongut eshte nje numer i plote pozotiv qe eshte 
		//i barabart me shumen e shifrave te tij te ngritur ne fuqin e numrit te shifrave
		//psh 371 ka tre shifra, 3^e + 7^3 + 1^3 = 27 + 343 +1 = 371.
		//shkruani nje program qe pranon nje numer te plot pozitiv dhe percakton
		Scanner s = new Scanner(System.in);
		
		System.out.println("Jep nje numer poztiv: ");
		int n = s.nextInt();
		int tmp = n;
		int org = n;
		int numri_i_shifrave = 0;
		
		while(tmp > 0) {
			numri_i_shifrave++;
			tmp /=10;
		}
		int sum = 0;
		while (n > 0) {
			int sh = n % 10;
			sum += Math.pow(sh, numri_i_shifrave);
			n /=10;
		}
		System.out.print(sum);
		
		if (org == sum)
			System.out.print("Armstrongut");
		else System.out.print("Nuk eshte Armsstrong");
		
}
}
