/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklistdemo;

/**
 *
 * @author 174013N
 */
public class LinkListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LikedList x = new LikedList();
       x.insertFirst(5);
       x.insertFirst(7);
       x.insertFirst(21);
       x.insertFirst(5);
       x.displayList();
       x.deleteFirst();
       x.displayList();
       x.delete(2);
       x.displayList();
    }
    
}


class Node {
int item;
Node next;

public Node(int item){
this.item = item;
this.next = null;
}

public  void display(){
    System.out.println(this.item+" ");

}
}

class LikedList{

    private Node head;
    
  public  LikedList() {
 head = null;
 }
  
   public boolean isEmpty() {
 if (head == null)
 {
 return true;
 
 }
 else
 {
 return false;
 }
 }

public void insertFirst(int i) {
   
    Node n = new Node(i);
    n.next = head;
    
    head = n;
 }

 public Node deleteFirst() {
     
     if(isEmpty()){
         System.out.println("linkedlist is empty nothing to delete");
         return null;
     }
     
     Node temp = head; 
   head = head.next;
   temp.next = null;
   return temp;
 }
 
  public void displayList() {
      if(isEmpty()){
          System.out.println("linked list is empty nothing to print");
      return ;
      }
  Node current = head;
  while(current != null)
  {
  current.display();
  current = current.next;
  
  }
      System.out.println();
 }
  
   public Node find(int key) {
       if(isEmpty())
       {
       System.out.println("linked list is empty nothing to find");
       return null;
       }
    int i=1;
    Node current = head;
    while(current != null)
    {
        
     if(i == key)
     {
    return current;
     }      
    current = current.next;
    i++;

    
    }
       System.out.println("Key is out of the linked list");
    return null;
 }

 public void delete(int key) {
     
     if(isEmpty()){
         System.out.println("linkedlist is empty nothing to delete");
         return ;
     }
     
     Node current, previous;
     current = head;
     previous = head;
     int i = 1;
     while(current != null)
     {
         if(i==key)
         {
             if(current == head){
            head = head.next; 
            }else
             {
                previous.next = current.next;
             }
      
             System.out.println(current.item+" was deleted");
             return;
         }
     previous = current;
     current = current.next;
     i++;
     }
     
         System.out.println("Key is out of the linked list");
   
 }



}