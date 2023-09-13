/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author PC
 */
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringCounterModel {
     private int letterCount;
    private int characterCount;
    private Map<String, Integer> characterCounts;
    private Map<String, Integer> wordCounts;

    public void count(String input) {
        letterCount = 0;
        characterCount = 0;
        characterCounts = new HashMap<>();
        wordCounts = new HashMap<>();

        StringTokenizer tokenizer = new StringTokenizer(input);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            characterCount += token.length();
            for (char c : token.toCharArray()) {
                if (Character.isLetter(c)) {
                    letterCount++;
                }
                String character = String.valueOf(c);
                int count = characterCounts.getOrDefault(character, 0);
                characterCounts.put(character, count + 1);
            }

            int count = wordCounts.getOrDefault(token, 0);
            wordCounts.put(token, count + 1);
        }
    }

    public int getLetterCount() {
        return letterCount;
    }

    public int getCharacterCount() {
        return characterCount;
    }

    public Map<String, Integer> getCharacterCounts() {
        return characterCounts;
    }

    public Map<String, Integer> getWordCounts() {
        return wordCounts;
    }
}