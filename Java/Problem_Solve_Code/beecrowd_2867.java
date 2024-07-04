import java.util.Scanner;
import java.math.*;
public class beecrowd_2867{
    public static void main(String[]args){
 Scanner sc =new Scanner(System.in);
  int a=sc.nextInt();
  for(int i=0;i<a;i++){
    int m=0,n=0;
    m=sc.nextInt();
    n=sc.nextInt();
    int p=Pow(m,n);
    System.out.println(p);
  }
    }
}