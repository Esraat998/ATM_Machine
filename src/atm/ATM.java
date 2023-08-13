package atm;

import java.util.*;

class atm{
    float balance;
    int PIN = 4567;
     public void checkpin(){
         System.out.println("////////////////////////// *** ATM MACHINE *** //////////////////////////");
         System.out.print("Enter your PIN: ");
         Scanner sc = new Scanner(System.in);
         int enteredpin = sc.nextInt();
         if(enteredpin == PIN){
             menu();
         }
         else{
             System.out.println("Enter a valid PIN :(");
             checkpin();
         }
         
     }
     public void menu(){
           System.out.println("/////////////////// *** CHOICES *** ///////////////////");
           System.out.println("1. Check A/C Balance");
           System.out.println("2. Withdraw Money");
           System.out.println("3. Deposit Money");
           System.out.println("4. Exit");
           
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter your choice :- ");
           int choice = sc.nextInt();
           System.out.println();
           if(choice == 1){
               checkBalance();
           }
           else if(choice == 2){
               withdrawMoney();
           }
           else if(choice == 3){
               depositMoney();
           }
           else if(choice == 4){
               return;
           }
           else{
               System.out.println("Enter Valid Choice ... :'(");
               menu();
           }
     }
     
     public void checkBalance(){
         System.out.println("Balance: " + balance);
         System.out.println();
         menu();
     }
     
     public void withdrawMoney(){
         System.out.println("Enter the Amount you want to Withdraw");
         Scanner sc = new Scanner(System.in);
         float amount = sc.nextFloat();
         if(amount > balance){
             System.out.println("Insuffiecient Balance :(");
             menu();
         }
         else{
             balance = balance - amount;
             System.out.println("Money Withdrawal Successful!");
             menu();
         }
     }
     
     public void depositMoney(){
         System.out.println("Enter the amount to deposit-> ");
         Scanner sc = new Scanner(System.in);
         float amount = sc.nextFloat();
         balance += amount;
         System.out.println("Money Deposited Successful!");
         menu();
     }
     
}
public class ATM {

    public static void main(String[] args) {
        // TODO code application logic here
        atm obj = new atm();
        obj.checkpin();
    }
    
}
