/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fizzbuzz;

import java.util.*;
/**
 *
 * @author utente
 */
public class Fizzbuzz 
{

    public static void main(String[] args) 
    {
        Scanner tastiera= new Scanner(System.in);
        
        int numero;
        
        System.out.println("Inserisci numero: ");
        numero=tastiera.nextInt();
        do
        {
            numero++;
            
            if(numero%3==0 && numero%5==0)
            {
                System.out.println("FizzBuzz");
            }
            
            else if(numero%3==0 || numero%5==0)
            {
                if(numero%3==0)
                {
                    System.out.println("Fizz");
                }
                
                else if(numero%5==0)
                {
                    System.out.println("Buzz");
                }
            }
            
            else
            {
                System.out.println(numero);
            }
            
        }while(numero<100);
        
        
        
    }
}
