package com.company;

import java.util.Map;
import java.util.TreeMap;

//Java Program to print number of vowels,words,character frequesncy in String
public class Frequency {
    public static void main(String[] args) {
        String str = "Learn With Krishana Sandeep";
        Frequency f = new Frequency();
        f.getWordVowelCount(str);
        f.frequency(str);
    }
    private  void getWordVowelCount(String str){
        int wordCount=0;int vowelCount=0;int upperCaseCount=0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            switch (c){
                case ' ':
                case '.':
                    wordCount++;
            }
            switch (c){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
            }
            if (c>=65 && c<=90) // check for uppercase character.
            {
                upperCaseCount++;
            }
        }
        System.out.println("wordCount :"+wordCount);
        System.out.println("vowelCount :"+vowelCount);
        System.out.println("upperCaseCount :"+upperCaseCount);
    }
    private void frequency(String str){
        TreeMap<Character,Integer> m = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            Integer c= m.get(str.charAt(i));

            if (m.get(str.charAt(i))==null){
                m.put(str.charAt(i),1);
            }
            else {
                m.put(str.charAt(i),++c);
            }
        }
        for (Map.Entry entry : m.entrySet()){
            System.out.println("Character = "+entry.getKey());
            System.out.println("Frequency = "+entry.getValue());
        }
    }
}
