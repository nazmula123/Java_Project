import java.util.Scanner;
public class beecrowd_2787{

public static void main(String[] args){

Scanner sc=new Scanner (System.in);
int a,b;
a=sc.nextInt();
b=sc.nextInt();
if(a%2!=0 && b%2==0)
{
   System.out. println("0");
}
else if(a%2!=0 && b%2!=0)
{
    System.out. println("1");
}
else if(a%2==0 && b%2==0)
{
    System.out. println("1");
}
else if(a%2==0 && b%2!=0)
{
    System.out. println("0");
}

}


}