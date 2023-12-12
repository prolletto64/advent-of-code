package it.prolletto64.AOC.twentythree;

import java.util.HashMap;
import java.util.Map;

import static it.prolletto64.AOC.utils.inputHandler.readLines;

public class one {
    private static final HashMap<String,Integer> DIGITS = new HashMap<String, Integer>() {{
            put("one", 1);
            put("1", 1);
            put("two", 2);
            put("2", 2);
            put("three", 3);
            put("3", 3);
            put("four", 4);
            put("4", 4);
            put("five", 5);
            put("5", 5);
            put("six", 6);
            put("6", 6);
            put("seven", 7);
            put("7", 7);
            put("eight", 8);
            put("8", 8);
            put("nine", 9);
            put("9", 9);
        }};
    private static final String[] lines = readLines("one");
    public static void run(){
        int total=0;
        for (String line:lines) {
            total+=getDigits(line);
        }
        System.out.println(total);
    }

    private static int getDigits(String line) {
        int firstDigitIndex=64;
        int lastDigitIndex=-64;
        String firstDigit="";
        String lastDigit="";
        int index=0;
        for (Map.Entry<String,Integer> entry:
             DIGITS.entrySet()) {
            if((index=line.indexOf(entry.getKey()))!=-1){
                if(index<firstDigitIndex) {
                    firstDigitIndex = index;
                    firstDigit = entry.getKey();
                }
                index=line.lastIndexOf(entry.getKey());
                if(index>lastDigitIndex) {
                    lastDigitIndex = index;
                    lastDigit=entry.getKey();
                }
            }
        }
        return DIGITS.get(firstDigit)*10 + DIGITS.get(lastDigit);
    }
}
