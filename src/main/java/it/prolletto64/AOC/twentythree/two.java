package it.prolletto64.AOC.twentythree;

import java.util.Map;

import static it.prolletto64.AOC.utils.inputHandler.readLines;

public class two {
    private static String[] lines = readLines("two");

    private static final Map<String,Integer> CUBES = Map.of(
            "red", 12,
            "green", 13,
            "blue", 14
    );

    public static void run() {
        int total=0;
        boolean invalid;
        for(String line: lines){
            invalid=false;
            for (String el : line.split(":")[1].split(",")) {
                for (String e : el.split(";")) {
                    e=e.substring(1);
                    if(Integer.parseInt(e.split(" ")[0])>CUBES.get(e.split(" ")[1])){
                        invalid=true;
                    }
                }
            }
            if(!invalid) total+=Integer.parseInt(line.split(":")[0].split(" ")[1]);
        }
        System.out.println(total);
    }
}
