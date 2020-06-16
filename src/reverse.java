import java.util.Scanner;
class reverse
{
  public static void main(String args[])
  {
    int n, reverse = 0,l=0;

    System.out.println("Enter an integer to reverse");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    while(n != 0)
    {
      reverse = (int) (reverse + (n%10)* Math.pow(10, l));
      n=n/10;
      l++;
    }

    System.out.println("Reverse of the number is " + reverse);
  }
}