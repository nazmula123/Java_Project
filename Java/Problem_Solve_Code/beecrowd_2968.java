import java.util.Scanner;
import java.math.*;
public class beecrowd_2968{

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double a,b,sum;
a=sc.nextDouble();
b=sc.nextDouble();
for(double i=10.0;i<=90.0;i=i+10.0){
sum=((a*b*i)/100.0);
if(i==90.0){
    System.out.printf("%.0f\n",Math.ceil(sum));
}
else {System.out.printf("%.0f ",Math.ceil(sum));
}
sum=0;
}
}
}