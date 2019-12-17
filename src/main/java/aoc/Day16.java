package aoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Day16 {

    public static void main(String[] args) {
        int day = 16;
        String fileName = "day" + day + ".txt";
        List<String> input;
        try(BufferedReader r = new BufferedReader(
            new InputStreamReader(ClassLoader.getSystemResourceAsStream(fileName)))){
            input = r.lines().collect(toList());
        } catch(IOException e){
            throw new UncheckedIOException(e);
        }
        System.out.println(part1(input));
        System.out.println(part2(input));
    }

    public static String part1(List<String> input) {
        ArrayList<Integer> past = new ArrayList<Integer>(
            input.stream().map(Integer::valueOf).collect(Collectors.toList()));
        ArrayList<Integer> cur = new ArrayList<Integer>();
        int[] pattern = new int[]{0 ,1, 0, -1};

        for (int i = 0; i < 4; i++) {
            int index = 0;
            for (int j = 0; j < past.size(); j++) {
                index++;
                for (int j2 = 0; j2 < past.size(); j2++) {
                    
                }
                
            }
        }
        return "";
    }

    public static String part2(List<String> input) {
        return "";
    }
}
