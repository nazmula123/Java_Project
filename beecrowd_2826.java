import java.util.Scanner;
public class beecrowd_2826{
    public static void main(String[]args){

    Scanner sc=new Scanner(System.in);
    String str1,str2;
    str1=sc.next();
    str2=sc.next();

  if(str1.compareTo(str2)==0){
    System.out.println(str1);
    System.out.println(str2);
  }
 else if(str1.compareTo(str2)>0){
    System.out.println(str2);
    System.out.println(str1);
 }
 else if(str1.compareTo(str2)<0){
    System.out.println(str1);
    System.out.println(str2);

    }
}
}