import java.util.Scanner;

public class Senitllloops{

   public static void main(String[] args) {
   
   Scanner s = new Scanner(System.in);
   
   double sum=0.0;
   int numratori = 0;
   
   System.out.println("Jepni vleren e x-it: (Shtypni eneter per dalje.)");
   String xStr = s.nextLine();
   while(!xStr.isEmpty())
   {
   sum = sum + Double.parseDouble(xStr);
   numratori++;
   System.out.println("Jepni vleren e Y-it:(Shtypni Enter per dalje.)");
   xStr = s.nextLine();
   }
   System.out.print("Vlera mesatare e numrave te dhene eshte: "+sum);
   }
   
   }
   