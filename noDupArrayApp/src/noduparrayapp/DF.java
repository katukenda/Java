
#boy boy
n=input()
l= n.lower().split()
k=len(l)
m=0

for i in range(k-1):

    if l[i]==l[i+1]:
        m+=1
print(m

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
            Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int l=ob.nextInt();
        int k=0;
        int n2=2*n;
        double arr[]=new double[n2];
        for(int i=0;i<n2;i++){
            arr[i]=ob.nextInt();
        }
        
        
        
        for(int i=0;i<n2;i++){
            double b=(arr[i+1]/arr[i])*10;
              if(l>b) 
                              {
                                 l=l-(int)b; 
                                  k++;
                              } 
                              
                              else{
                                  System.out.print("NO ");
                                   System.out.print(k);
                                  return;
                              }
            i++;
              
        }
         
        
      System.out.println("YES"); 
        
        
        
    }

    }