/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cs102assignment04;

/**
 *
 * @author jehuv
 */
public class ParentheticalBalanceCheck {
    public static void main(String[] args)
    {
       String balancedString = "(x + 1)x = y'";
       String unbalancedString = "x((x+1)(3y+4) = y'";
       
       System.out.println("The function returns " + balanceCheck(balancedString) + " on the first string.");
       System.out.println("The function returns " + balanceCheck(unbalancedString) + " on the second string.");
    }
    
    public static boolean balanceCheck(String inputString)
    {
        String open = "(";
        String close = ")";
        
        int openCount = 0;
        int closeCount = 0;
        
        for(int i = 0; i < inputString.length(); i++)
        {
            if(inputString.charAt(i) == open.charAt(0))
            {
                openCount++;
            }
            else if(inputString.charAt(i) == close.charAt(0))
            {
                closeCount++;
            }
        }
        
        if(openCount == closeCount)
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
}
