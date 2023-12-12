package it.prolletto64.AOC.twentythree;

import static it.prolletto64.AOC.utils.inputHandler.readLines;

public class one {
    private static final String[] lines = readLines("one");
    public static void run(){
        int total=0;
        int firstDigit;
        int lastDigit;
        int digit;
        for (String line:lines) {
            firstDigit=0;
            lastDigit=0;
            for (char c: line.toCharArray()) {
                digit=-1;
                try{
                    digit=Integer.parseInt(String.valueOf(c));
                }catch (Exception e){}
                if(digit!=-1){
                    if(firstDigit==0)
                        firstDigit=digit;
                    lastDigit=digit;
                }
            }
            total+=firstDigit*10+lastDigit;
        }
        System.out.println(total);
    }
}
