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
        String[] words = fizzBuzz(number);
        printToScreen(words);
    }

    private static int askUserANumber() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Inserisci numero: ");
        return keyboard.nextInt();
    }

    private static void printToScreen(String[] words) {
        for (String word : words){
            System.out.println(word);
        }
    }

    private static String[] fizzBuzz(int numero) {
        final int WORDS_MAX_COUNT = 100;
        String[] words = new String[WORDS_MAX_COUNT];
        int wordsCount = 0;

        do
        {
            numero++;

            String word = intToString(numero);

            if(numero %3==0 && numero %5==0)
            {
                word="FizzBuzz";
                words[wordsCount] = word;
            }

            else if(numero %3==0 || numero %5==0)
            {
                if(numero %3==0)
                {
                    word="Fizz";
                    words[wordsCount] = word;
                }

                else if(numero %5==0)
                {
                    word="Buzz";
                    words[wordsCount] = word;
                }
            }

            if(word.contains("3"))
            {
                words[wordsCount] = word;
            }

            else if(word.contains("5"))
            {
                words[wordsCount] = word;
            }


            else
            {
                words[wordsCount] = word;
            }

            wordsCount++;
        }while(numero < WORDS_MAX_COUNT);
        return words;
    }

    private static String intToString(int numero) {
        return Integer.toString(numero);
    }
}
