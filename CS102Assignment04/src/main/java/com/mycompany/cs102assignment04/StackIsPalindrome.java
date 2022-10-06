/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cs102assignment04;

import java.util.Stack;

/**
 *
 * @author jehuv
 */
public class StackIsPalindrome {
    public static void main(String[] args)
    {
        String palindrome = "madam";
        String notPalindrome = "I'm adam";
        
        System.out.println("The function returns " + isPalindrome(palindrome) + " on the first string.");
        System.out.println("The function returns " + isPalindrome(notPalindrome) + " on the second string.");
    }
    
    public static boolean isPalindrome(String inputString)
    {
        int stringLength = inputString.length();
        boolean isOdd = true;
        
        Stack myStack = new Stack();
        
        if(stringLength - (stringLength / 2) == (stringLength / 2))
        {
            isOdd = false;
        }
        
        for(int i = 0; i < stringLength / 2; i++)
        {
            myStack.push(inputString.charAt(i));
        }
        if(isOdd)
        {
            for(int i = (stringLength / 2) + 1; i < stringLength; i++)
            {
                if((char) myStack.pop() != inputString.charAt(i))
                {
                    return false;
                }
            }
        }
        else
        {
            for(int i = stringLength / 2; i < stringLength; i++)
            {
                if((char) myStack.pop() != inputString.charAt(i))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
