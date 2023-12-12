package it.prolletto64.AOC.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class inputHandler {
    public static String[] readLines(String day){
        List<String> lines = new ArrayList<String>();
        File f = new File("cache/2023/"+day);
        if(f.isFile()){
            try {
                BufferedReader br = new BufferedReader(new FileReader(f));
                String line;
                while((line=br.readLine())!=null){
                    lines.add(line);
                }
            } catch (Exception e) {}
        }
        return lines.toArray(String[]::new);
    }
}
