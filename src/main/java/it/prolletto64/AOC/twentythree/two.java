package it.prolletto64.AOC.twentythree;

import java.util.HashMap;
import java.util.Map;

import static it.prolletto64.AOC.utils.inputHandler.readLines;

public class two {
    private static String[] lines = readLines("two");

    private static Map<String,Integer> cubes = new HashMap<String, Integer>() {{
            put("red", 0);
            put("green", 0);
            put("blue", 0);
        }};

    public static void run() {
        int total=0;
        int cubenumber;
        String color;
        for(String line: lines){
            resetMap();
            for (String el : line.split(":")[1].split(",")) {
                for (String e : el.split(";")) {
                    e=e.substring(1);
                    cubenumber=Integer.parseInt(e.split(" ")[0]);
                    color=e.split(" ")[1];
                    if(cubenumber>cubes.get(color)){
                        cubes.put(color,cubenumber);
                    }
                }
            }
            total+=cubes.get("red")*cubes.get("green")*cubes.get("blue");
        }
        System.out.println(total);
    }

    public static void resetMap(){
        cubes=new HashMap<String, Integer>() {{
            put("red", 0);
            put("green", 0);
            put("blue", 0);
        }};
    }
}
