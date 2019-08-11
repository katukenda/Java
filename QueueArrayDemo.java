/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuearraydemo;

/**
 *
 * @author 174072R
 */
public class QueueArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        QueueArray x = new QueueArray(5);
       x.EnQueue(7);
       x.EnQueue(3);
       x.EnQueue(9);
       x.EnQueue(1);
       x.EnQueue(2);
       x.display();
       x.EnQueue(8);
       
    }
    
}

class QueueArray{

    private int maxSize ;
private int[] queArray ;
private int front ;
private int rear ;
private int nItems ; 

public QueueArray(int s){
    this.queArray = new int[s];
    this.maxSize=s;
    this.nItems=0;
    this.front=0;
    this.rear=0;
    

}
public boolean isEmpty(){

return this.nItems==0;
}
public boolean isFull(){

return this.maxSize == this.nItems;
}
public int size(){

    return this.nItems;
}

public void EnQueue(int value){
    if(isFull()){
        System.out.println("Queue is full cannot insert");
    return;}
    
    if(this.rear==this.maxSize-1){
        this.rear=0;}
    else{
       
    
this.rear++;}
    
    
this.queArray[rear] = value;
this.nItems++;
    System.out.println(value+" Inserted ");
    
}
public int DeQueue(){
    if (isEmpty()){
        System.out.println("Queue is empty cannot remove");
        return -1;
    }
    int temp=this.queArray[front];
    if(this.front==this.maxSize-1){
   this.front=0; 
    }else{
    this.front++;
    }
    
    this.nItems--;
    return temp;

}
public int peek()throws Exception {
if(isEmpty()){
    throw new Exception("Queue is empty cannot get peek/front element");
}
return this.queArray[this.front];
}

public void display()
{
    if(isEmpty()){
        System.out.println("Queue is empty cannot display elements");
        return;
  
    }
    
    int i = this.front;
    while(true){
    System.out.println(queArray[i]+ " ");
    if(i==this.rear){
    break;}
    
        if(i==this.maxSize-1){
    i=0;}
    
    else
    { i++;
       }
     
    
    }
    //System.out.println(queArray[rear]+" ");
    System.out.println();
}

    
}



