/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cs102assignment04;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author jehuv
 */
public class MinimumInQueue {
    public static void main(String[] args)
    {
        Queue<Integer> exampleQueue = new LinkedList();
        exampleQueue.add(18);
        exampleQueue.add(7);
        exampleQueue.add(21);
        exampleQueue.add(23);
        exampleQueue.add(12);
        
        System.out.println("The minimum value of this queue is " + findMin(exampleQueue));
    }
    
    public static int findMin(Queue<Integer> inputQueue)
    {
        int min = inputQueue.poll();
        for(Integer i : inputQueue)
        {
            if(i < min)
            {
                min = i;
            }
        }
        return min;
    }
}
