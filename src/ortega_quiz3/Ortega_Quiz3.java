/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ortega_quiz3;

import java.util.Scanner;
            

/**
 *
 * @author home
 */
public class Ortega_Quiz3 {

    
    static int MAX = 9;
    private int [] data = new int [MAX];
    private int front;
    private int rear;
    
    private void insertion (int index) throws Exception{
        //overflow
        if (( front == 0 && rear == MAX -1) || (rear  + 1 == front)){
            throw new Exception("Queue is full");
        }
        
        if (rear == MAX - 1){
            rear = 0;
        }else if ( front == 1){
            front = 0;
        }else{
            data[rear++] = index;
        }
    }
    
     public void insertionbeg(int item) throws Exception{
     if(rear == MAX){
         throw new Exception("Queue is full");
     }
         
         if (front == -1){
             front = rear =0;
             data[front] = item;
         } else{
             if (front == 0){
                   throw new Exception("Cannot insert at beginning Queue is full");
             }
             data[--front] = item;
         }       
     }
 
 private void insertionend(int item) throws Exception{
     if (rear == MAX -1){
         throw new Exception ("Queue is full");
     }
     
     data [rear++] = item;
 }

 private int deletionBeg() throws Exception{
      if(rear == -1){
         throw new Exception("Queue is empty");
     }
      
      int temporary =data[front];
      if(front == rear){
          front = rear = -1; //reset front and rear since theres only one item
      }else{
          front ++; 
      }
      return temporary; //return the deleted item
 } 
 
 private int deletionEnd() throws Exception{
      if(rear == -1){
         throw new Exception("Queue is empty");
     }
      
       int temporary = data[rear];
       if(front == rear){
           front = rear = -1 ;
       }else{
           rear++;
       }
       return temporary;
 }
     private int deletion() throws Exception{
        if (front == -1){
            throw new Exception(" Queue is empty");
    }
        int temporary = data[front];
        
        if (front == rear ){
            front = rear = -1;
        }else if (front == MAX -1){
            front =0 ;
        }else{
            front ++;
        }
        return temporary;
    }
    
    private void display() throws Exception{
            //overflow
            if(front == 1){
                 throw new Exception("Queue is Empty"); 
            }             
            
        if (rear < front){
                for (int i =front; i <=MAX -1; i++){
                   System.out.println(data[i] + "");  
                }
            for (int i =0; i <= rear; i++){
            System.out.println(data [i] + "");
                }
    }else{
            for (int i = front; i < rear; i++){
        System.out.println(data[i] +"");
    }
            System.out.println("NULL");
}
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        Ortega_Quiz3 q = new Ortega_Quiz3();
        
        while (true){            
            System.out.println("[1] Problem 1");
            System.out.println("[2] Problem 2");
            int choose = scan.nextInt();
            
            switch (choose) {
                case 1:
                  Scanner scann = new Scanner(System.in);
        
                       System.out.println("Enter Elements:");
                              int num = scann.nextInt();
                       System.out.println("-------------------");
                              q.insertion(num);
                  
                  break;
                    
                case 2:
                     Scanner snn = new Scanner(System.in);
                    boolean choose2 = true;
                    
                     while(choose2){
                         Scanner scn = new Scanner(System.in);
                         System.out.println("1. Insert");
                         System.out.println("2. Delete");
                         System.out.println("3. Display");
                         int sel = scn.nextInt();
                         
                         
                         switch (sel) {
                             case 1:
                                 System.out.println("Enter Elements:");
                                   int index = scan.nextInt();
                                 System.out.println("-------------------");  
                                    q.insertion(index);
                                 break;
                                 
                             case 2:
                                  System.out.println("-------------------"); 
                                 System.out.println(q.deletion() + " deleted successfully");
                                  System.out.println("-------------------"); 
                                 break;
                                 
                             case 3:
                                  System.out.println("-------------------"); 
                                 q.display();
                                  System.out.println("-------------------"); 
                                 break;
                         } 
                            break;
                     }
                     break;
                     
                default:
                    throw new AssertionError();
            }
        }
    }
    
}
