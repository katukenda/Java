/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordarrayapp;

/**
 *
 * @author 174072R
 */
public class Ordarrayapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     OrdArray x=new OrdArray(10);
     x.insert(7);
     x.insert(3);
     x.insert(8);
     x.insert(2);
     x.insert(6);
      x.insert(8);
     x.insert(2);
     x.insert(6);
    x.display();
      x.delete(2);
      x.display();
       
    }
    
}
class OrdArray{
private long[] a;
private int nElements;

public OrdArray(int max){
a=new long[max];
this.nElements=0;

}
    public int size(){
    
    return a.length;
    }  
    
    
    public int find(long searchkey){
    
    for(int i=0;i<nElements;i++){
    if(a[i]==searchkey)
    {
        return i;  
                 }
    
    }
    
    return -1;
    }
    
    
    public void insert (long value)
    {
        
        
       if(nElements==size())
       {
       System.out.println("array full");
       }
   for(int i=0;i<nElements;i++)
        {
   if(a[i]>value)
             {
    for(int j=nElements;j>i;j--){
            a[j]=a[j-1];
   
                }
    
                a[i]=value;
                nElements++;
                return;
   
   
             }
        }
    a[nElements]=value;
    nElements++;
        
    }
    
    public boolean delete( long value){
        
        if(nElements==0){
        
      System.out.print("array is empty");
        }
        //........................................
        
        //1,2,2,5,7,9
        boolean status=false;
        for(int i=0;i<nElements;i++){//outer for loop
            if(a[i]==value){
            for(int j=i; j<nElements-1;j++){
                a[j]=a[j+1];
               
                }
             nElements--;
             i--;//then again run the inner for loop
             //1,2,5,7,9,9
             //nElements walata last 9 aithi wenne , e hinda last 9 print wenne
           status =true;
            }
            
            
        
        
        }
        return status;
    
        
    
    }
    public void display(){
    if(nElements ==0){
    System.out.print("nothing to display");
    }
    for(int i=0;i<nElements;i++){
        System.out.print(a[i]+" ");
    }
        System.out.println(" ");
    
    
    }
    
      

}
