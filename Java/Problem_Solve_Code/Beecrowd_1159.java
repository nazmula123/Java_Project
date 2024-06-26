import java.util.Scanner;
public class Beecrowd_1159{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
  int a;
while(true){
  a=sc.nextInt();
  if(a==0)
  break;
  int sum=0;
if(a%2==0){
  
for(int i=0;i<5;i++){
sum=sum+a;
a=a+2;
}
System.out.println(sum);
}
else{
a=a+1;
for(int i=0;i<5;i++){
    sum+=a;
    a+=2;
}
System.out.println(sum);
}}}}

