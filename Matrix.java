/*  MATRIX INPUT  */
import java.util.Scanner;
class Matrix
{
  public static void main(String args[])
{
  Scanner KB=new Scanner(System.in);
  System.out.print("enter rows ");
  int r=KB.nextInt();
  System.out.print("enter colms ");
  int c=KB.nextInt();
  int x[][]=new int[r][c];
  for(int i=0;i<x.length;i++)
  {
  for(int j=0;j<x.length;j++)
  {
  System.out.print("x["+i+"]["+j+"]");
  x[i][j]=KB.nextInt();
  }
  }
 for(int i=0;i<x.length;i++)
   {
  for(int j=0;j<x[i].length;j++)
  {
  System.out.print(x[i][j]);
  }
  }
  System.out.println();
  }
  }