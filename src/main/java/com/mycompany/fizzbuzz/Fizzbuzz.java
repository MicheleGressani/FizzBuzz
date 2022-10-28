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
        int number = askUserANumber();
        if(number>100)
        {
            System.out.println("ERRORE! Hai inserito un numero maggiore di quello richiesto, riprova!");
        }
        else
        {
            String[] words = fizzBuzz(number, 100);
            printToScreen(words);
        }
    }

    private static int askUserANumber()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("ESERCIZIO FIZZBUZZ");
        System.out.print("Inserisci un numero tra 1 e 100: ");
        return keyboard.nextInt();
    }

    private static void printToScreen(String[] words)
    {
        for (String word : words)
        {
            if(word==null)
            {
                System.out.println("");
            }
            else
            {
                System.out.println(word);
            }
        }
    }

    public static String[] fizzBuzz(int numero, int wordsMaxCount)
    {
        String[] words = new String[wordsMaxCount];

        for (int i = 0; i < wordsMaxCount && numero < wordsMaxCount; i++)
        {
                numero++;
                words[i] = fizzBuzzWord(numero);
        }
        return words;
    }

    public static String fizzBuzzWord(int numero)
    {
            String word="";
            String numStr=intToString(numero);

            if(numero%3==0)
            {
                word+="Fizz";
            }

            if(numStr.contains("3") && singleDigitLimit(numero))
            {
                word+="Fizz";
            }

            if(numero%5==0)
            {
                word+="Buzz";
            }

            if(numStr.contains("5") && singleDigitLimit(numero))
            {
                word+="Buzz";
            }

            if(word.isEmpty())
            {
                return intToString(numero);
            }

            return word;
    }

    private static boolean singleDigitLimit(int numero)
    {
        return numero >= 10;
    }

    private static String intToString(int numero)
    {
        return Integer.toString(numero);
    }
}