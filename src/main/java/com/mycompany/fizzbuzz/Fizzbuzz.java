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
        String[] words = fizzBuzz(number, 100);
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

    public static String[] fizzBuzz(int numero, int wordsMaxCount) {
        String[] words = new String[wordsMaxCount];

        for (int i = 0; i < wordsMaxCount; i++){
            numero++;
            words[i] = fizzBuzzWord(numero);
        }
        return words;
    }

    public static String fizzBuzzWord(int numero) {
        String word = intToString(numero);
        if(numero %3==0 && numero %5==0)
        {
            word="FizzBuzz";
        }

        else if(numero %3==0 || numero %5==0)
        {
            if(numero %3==0)
            {
                word="Fizz";

            }

            else if(numero %5==0)
            {
                word="Buzz";

            }
        }

        if(word.contains("3"))
        {
            word="Fizz";

        }

        else if(word.contains("5"))
        {
            word="Buzz";

        }
        return word;
    }

    private static String intToString(int numero) {
        return Integer.toString(numero);
    }
}
