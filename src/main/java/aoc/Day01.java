// package aoc.day01;

// import aoc.Day;

// import java.util.List;

// public class Day01 implements Day {

//     @Override
//     public String part1(List<String> input) {
//         int ans = 0;
//         int hoge;
//         for (String string : input) {
//             hoge = Integer.parseInt(string);
//             ans += hoge/3-2;
//         }
//         return Integer.toString(ans);
//     }

//     @Override
//     public String part2(List<String> input) {
//         long ans = 0;
//         for (String string : input) {
//             long w = Long.parseLong(string);

//             while (w / 3 > 0) {
//                 ans += Math.max(w / 3 -2, 0);
//                 w = w / 3 - 2;
//             }
//         }

//         return Long.toString(ans);
//     }

// }
