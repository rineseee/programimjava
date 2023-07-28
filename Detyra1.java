
public class Detyra2 {

	public static void main(String[] args) {
		// shkruani nje program ne java qe do te ktheje nga ana e kundert
		//sekuencen e shkronjave ne secilen fjale nga paragrafi qe jepet si hyrje 
		//P.sh , nese hyrja eshte "to be or not to be" athere rezultati duhet te jete
		//"To be or not to be"==> "ot eb ro ton ot eb."
		
		String s= "To be or not to be";
		String v[] = s.split(" ");
		
		for (String s1 : v) {
			for (int i = s1.length() -1; i>=0; i--) {
				System.out.print(s1.charAt(i));
			}
			System.out.print(" ");
		}

	}

}
