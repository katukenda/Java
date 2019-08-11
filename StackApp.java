/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackapp;

/**
 *
 * @author 174072R
 */
public class StackApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StackArray x=new StackArray(6);
        x.push(7);
        x.push(8);
        x.push(3);
        x.push(5);
        x.push(-1);
        x.display();
        try{
        
            x.pop();
            x.display();
        
        }catch{
        sy
        }
        
        
        // TODO code application logic here
    }
    
}
class StackArray {

    private int maxSize; //size of stack array
 private int [] stackData;
 private int top; //top of stack
 
 
 public StackArray (int s) //s is maximum size of array
 {
     this.stackData=new int[s];
     this.maxSize=s;
     this.top=-1;
     
     } //constractor 
 
 public boolean isEmpty () {
     return top==-1;
 
 
 } //true if stack is empty
 public boolean isFull () {
     return this.top==this.maxSize-1;
 
 
 }
 
 public void push(int j){
     if (isFull()){
         System.out.println("array is full connot push");
         return;
     }
     
     this.stackData[++top]=j;
     //this.stackData[top+1]=j;
    // this.top++;
 
 
 }
 
 
 public int pop() throws Exception{
     if(isEmpty()){
     
   throw new Exception(" Stack is empty connot pop");
     }
     
 //top--;
 //return stackData[top+1];
 return stackData[top--];
 
 
 }
 
 public int peek() throws Exception{
     if(isEmpty()){
     
     throw new Exception("Stack is empty cannot get peek");
     }
 return stackData[top];
 }
 
 public void display(){
 for(int i=top;i>=0;i--){
     System.out.println(stackData[i]+" ");
 }
 }
 
}