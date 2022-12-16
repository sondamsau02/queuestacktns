/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsaasm;

/**
 *
 * @author ADMIN
 */
import java.util.InputMismatchException;
import java.util.EmptyStackException;
        
import java.util.Scanner;
public class DSAasm {
    public static Queue queue;
    public static Stack stack;

  
    public static void main(String[] args) throws Exception {
        int choiceNumber;
        queue = new Queue();
        stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        try{
        do{
            System.out.println("1.input the Message");
            System.out.println("2.sending message");
            System.out.println("3.View message just sent");
            System.out.println("4.Exit :D");
            
               System.out.println("Select Option:");
               choiceNumber = scanner.nextInt();
               
            if(choiceNumber == 1)
            {
                inputMessage();
            }
            else if (choiceNumber == 2 )
            {
                sendMessage();
            
            }
            else if (choiceNumber == 3)
            {
                viewMessage();
                
               
            }
            else if (choiceNumber == 4)
            {
                System.out.println("Done successfully :D ");
                break;
            }
            
            else 
                throw new Exception ("the progam run 1 to 4");
            
            
        
        }while(choiceNumber!=4);
        }
        catch(InputMismatchException e)
        {
            System.out.println("pleas renter can't enter word on select number");
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        
        }
        
    }
    public static void inputMessage(){
     Scanner scanner = new Scanner(System.in);
        System.out.println("the text you enter must be below 250words");
        String str = scanner.nextLine();
        
        if (str.length()<250){
           queue.enqueue(str);
        }else{
            System.out.println("the texting must below 250words put again pleas ");
            
        }
        
    }
    public static void sendMessage() throws Exception{
      while (!queue.isEmpty()){
         String message = (String) queue.dequeue();
         stack.push(message);
          System.out.println("Successfully sent");
      }
      
    }
    public static void viewMessage(){
      while (!stack.isEmpty()){
           String message = (String) stack.pop();
           System.out.println(message);
      }
    }
    

    
}











