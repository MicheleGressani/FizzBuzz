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
        String FizzBuzz;
        
        System.out.print("Inserisci numero: ");
        numero=tastiera.nextInt();
        do
        {
            numero++;
            
            String string;
            string=""+numero;
            
                        
            /*if(numero%3==0 && numero%5==0)
            {
                string="FizzBuzz";
                System.out.println(string);
            }
            
            else if(numero%3==0 || numero%5==0)
            {
                if(numero%3==0)
                {
                    string="Fizz";
                    System.out.println(string);
                }
                
                else if(numero%5==0)
                {
                    string="Buzz";
                    System.out.println(string);
                }
            }*/
            
            if(string.contains("3"))
            {
                System.out.println("Fizz");
            }
            
            else if(string.contains("5"))
            {
                System.out.println("Buzz");
            }
            
            
            else
            {
                System.out.println(numero);
            }
            
        }while(numero<100);
        
        
        
    }
}
