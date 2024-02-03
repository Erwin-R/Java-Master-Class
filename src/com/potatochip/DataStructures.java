package com.potatochip;

import java.util.HashMap;
import java.util.Stack;

public class DataStructures {
    public static void main(String[] args) {
        String[] input = {"1, 1, 1, 1, 3, 4, 5, 6, 7, 7, 7, 7, 7, 8, 8"};
        HashMap<String, Integer> occurrences = countOccurrences(input);

        for (String key : occurrences.keySet()) {
            System.out.println("\"" + key + "\": " + occurrences.get(key));
        }

        System.out.println(mostOccurrences(occurrences));

        String brackets1 = "[{{[(){}]}}[]{}{{(())}}]";
        String brackets2 = "[{{}}[]{}{{(())}}]";
        String brackets3 = "[{}{}{{()}}]";
        String brackets4 = "[{}{{}}]";
        String brackets5 = "[{{}}]";
        String brackets6 = "[{}]";
        String brackets7 = "";
        String brackets8 = "{)";


        System.out.println(isBalanced(brackets1));
        System.out.println(isBalanced(brackets2));
        System.out.println(isBalanced(brackets3));
        System.out.println(isBalanced(brackets4));
        System.out.println(isBalanced(brackets5));
        System.out.println(isBalanced(brackets6));
        System.out.println(isBalanced(brackets7));
        System.out.println(isBalanced(brackets8));


    }

    public static HashMap<String, Integer> countOccurrences(String[] input) {
        HashMap<String, Integer> occurrencesMap = new HashMap<>();

        for(String element: input){
            String[] elements = element.trim().split(",\\s*");
            for(String e: elements){
                occurrencesMap.put(e, occurrencesMap.getOrDefault(e, 0) + 1);

            }
        }

        return occurrencesMap;
    }


    public static String mostOccurrences(HashMap<String, Integer> occurrencesMap){
        int mostOcc =  0;
        String keyNum = "";

        for(String key: occurrencesMap.keySet()){
            if(occurrencesMap.get(key) > mostOcc){
                mostOcc = occurrencesMap.get(key);
                keyNum = key;
            }
        }
        return keyNum;
    }


    public static boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();


        for(char c: input.toCharArray()){
            if(c == '[' || c == '{' || c == '('){
                stack.push(c);
            } else{
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();

                if((c == ']' && top != '[') || (c == '}' && top != '{') || (c == ')' && top != '(')){
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
