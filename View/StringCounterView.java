/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.StringCounterController;
import Model.StringCounterModel;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author PC
 */

public class StringCounterView {
    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }

    public void displayResult(int letterCount, int characterCount, Map<String, Integer> characterCounts, Map<String, Integer> wordCounts) {
      
        System.out.println("Number of characters: " + characterCount);
        
        System.out.println("Word counts:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Character counts:");
        for (Map.Entry<String, Integer> entry : characterCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}