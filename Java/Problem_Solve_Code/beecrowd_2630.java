import java.util.Scanner;
public class beecrowd_2630
{
    public static void main(String[]args){
  Scanner sc=new Scanner (System.in);
 int a=sc.nextInt();
 int i;
 for(i=0;i<a;i++){
  String str;int min,max,sum=0;
  str=sc.next();
 int [] arr=new int [5];
 for(i=0;i<3;i++)
{
    arr[i]=sc.nextInt();
}
 if(str.compareTo("min")==0)
    {  
        min=arr[0];
       for(i=0;i<3;i++){
       if(arr[i]<min){
       min=arr[i];
       }
       }
      System.out.printf("Caso #%d: %d\n",i+1,min);
    }
    else if(str.compareTo("max")==0)
    {  
        max=arr[0];
       for(i=0;i<3;i++){
       if(arr[i]>max){
       max=arr[i];
       }
            
        }
       System.out.printf("Caso #%d: %d\n",i+1,max);
    }
    else if(str.compareTo("mean")==0){
    
        for(i=0;i<3;i++){
            sum=sum+arr[i];
        }
       System.out.printf("Caso #%d: %d\n",i+1,sum/3);
    }
    else if(str.compareTo("eye")==0){
        double mun=0;
        for(i=0;i<3;i++){
        mun=(arr[0]*0.3)+(arr[1]*0.59)+(arr[2]*0.11);
        } 
        
        System.out.printf("Caso #%d: %.0f\n",i+1,mun-1);
    }

 }

    }
}
