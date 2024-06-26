import java.util.Scanner;
public class Beecrowd_1151{
   
        public static int  fabo(int a){
            if(a<=1) return a;
            else return fabo(a-1)+fabo(a-2); 
        }

        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int a; a=sc.nextInt();
            for(int i=0;i<a;i++){
                if(i==0){
                  System.out.printf("0");
                }
                else{
               System.out.printf(" %d",fabo(i));
            }
            }
            System.out.printf("\n");
            }
        }
