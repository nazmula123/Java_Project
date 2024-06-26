import java.util.Scanner;

public class Beecrowd_1161{
    public static long fabo(long x){
          if(x<=1)
    return 1;
    else return x*fabo(x-1);
    
}
public static long fact(long x)
{

 if(x<=1)
    return 1;
    else return x*fact(x-1);

}

        public static void main(String[]args){
           long a,b;
            Scanner sc=new Scanner(System.in);
            while(sc.hasNext()){
                a=sc.nextInt();
                b=sc.nextInt();
                System.out.println(fabo(a)+fact(b));
            }

        }
}
