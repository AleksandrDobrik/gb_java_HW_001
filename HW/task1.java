import java.util.Scanner;
public class task1
 {
    public static void main(String[] args) 
    {
      // сумма чисел н-го треугольного числа, н!
      Scanner iScanner = new Scanner(System.in);
      int n = iScanner.nextInt();
      iScanner.close();
      System.out.println((n*(n+1))/2);
      int nFac = 1;
      for (int i = 1; i < n + 1; i++) 
      {
         nFac *= i; 
      }
      System.out.println(nFac);
    }
 }