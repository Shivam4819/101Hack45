package javaapplication26;

import java.util.Scanner;

public class WashingPlates {

    public void washing() {
        Scanner scanner=new Scanner(System.in);
        int n=0,k=0;
        n=scanner.nextInt();
        k=scanner.nextInt(); 
        long[] p={100,100,140};
        long[] d={50,50,1};
        int m=0,j=0;
        long max=0,sum=0,sum2=0; 
         for(int i=0;i<p.length;i++){
             p[i]=scanner.nextInt();
             d[i]=scanner.nextInt();
        }
         
         while(m<n){
            max=p[0];
            for(int i=0;i<p.length;i++){
                if(max<p[i]){
                    max=p[i];
                    j=i;
                }
            }
            p[j]=-1;
            sum=sum+max;
            m++;
         }
         System.out.println("sum->"+sum);
         
         
        for(int i=0;i<d.length;i++){
            if(p[i]!=-1){
               sum2=sum2+d[i];
            }
        }
        System.out.println("sum2->"+sum2);
        sum=sum-sum2;
        System.out.println("final sum"+sum);
    }
}
    



