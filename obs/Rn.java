import java.util.Scanner;
class Rn
{
  public static void main(String args[])
  {
    int n, r= 0;

    System.out.println("Enter n");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();

    while(n != 0)
    {
      r=r*10;
      r=r+n%10;
      n = n/10;
    }

    System.out.println("Reverse is:\t" + r);
  }
}
