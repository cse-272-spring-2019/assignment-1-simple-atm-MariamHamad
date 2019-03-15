/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;
import java.util.Scanner;
/**
 *
 * @author Mariuma
 */

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mariuma
 */
public class ATM {
    
    private String currentBalance="0";
    private String[] historyString=new String[5];
    private int i;
    private int j=5;
    
    public String getCurrentBalance()
    {   
       for(int i=0;i<=3;i++)
         {
             historyString[i]=historyString[i+1];
         }
         historyString[4]="Balance Inquiry: "+(this.currentBalance);
         j=5;
        return this.currentBalance;
    }
    
    public boolean withdraw(String amount)
    {
           
        
        if(Double.parseDouble(amount)<=Double.parseDouble(currentBalance))
        {
            
             for(int i=0;i<=3;i++)
         {
             historyString[i]=historyString[i+1];
         }
         historyString[4]="Withdraw: "+(amount);
         j=5;
         
        double temp=Double.parseDouble(currentBalance);
        
         temp=temp-Double.parseDouble(amount);
         this.currentBalance=Double.toString(temp);
        return true;
        }
        else
            return false;
            
       
    }
    
    public void deposit(String amount)
    {   
      for(int i=0;i<=3;i++)
         {
             historyString[i]=historyString[i+1];
         }
         historyString[4]="Deposit: "+(amount);
         j=5;
        
        double temp=Double.parseDouble(currentBalance);
        temp=Double.parseDouble(amount)+temp;
        
        this.currentBalance=Double.toString(temp);
    }
    
     public String previous()
    {   
        if(j>0)
        {
           j--;
            return historyString[j];
        }
        else
            return "null";
    }
    
    public String next()
    { 
       
        if(j<4)
        {
           j++;
            return historyString[j];   
        }
        else
            return "null";
    }
    
}
