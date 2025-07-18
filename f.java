import java.util.Scanner;

class f {
    public static void main (String args[])
    {
        // Check whether Number 1 and Number 2 is Equal or not
        Scanner scan = new Scanner(System.in); 
        
         int num1 = scan.nextInt();
         int num2 = scan.nextInt();


         if (num1==num2)
         {
            System.out.print("Numbers are equal");
         }
         else
         {
            System.out.print("Numbers are not equal");
         }
    }
}