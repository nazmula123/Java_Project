import java.util.Scanner;
public class beecrowd_2949{

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
String str;char ch;int count=0,count1=0,count2=0,count3=0,count4=0;
for(int i=0;i<a;i++){
str=sc.next();
ch=sc.next().charAt(0);
if(ch=='X')
   count++;
  if(ch=='H')
count1++;
if(ch=='E')
 count2++;
 if(ch=='A')
 count3++;
 if(ch=='M')
 count4++;
}
  System.out.printf("%d Hobbit(s)\n",count);
  System.out.printf("%d Humano(s)\n",count1);
  System.out.printf("%d Elfo(s)\n",count2);
  System.out.printf("%d Anao(oes)\n",count3);
  System.out.printf("%d Mago(s)\n",count4);
}
}