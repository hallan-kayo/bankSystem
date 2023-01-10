/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.main;

import com.model.entities.Account;
import java.util.Scanner;
import com.model.exceptions.AccountExceptions;



/**
 *
 * @author hallan
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
         try{
            System.out.println("Enter account data");
        
            System.out.println("Number:");
            Integer number = input.nextInt();
            System.out.println("Holder:");
            String holder = input.next();
            System.out.println("Initial balance:");
            double balance = input.nextDouble();
            System.out.println("Withdraw limit:");
            double limit = input.nextDouble();

            Account account = new Account(number, holder, balance, limit);
        
       
            account.withDraw(400.0);
            System.out.println("New Balance: " + account.getBalance());
            
        }catch(AccountExceptions error){
            
            System.out.println("Error: "+ error.getMessage());
            
        }
    }
}
