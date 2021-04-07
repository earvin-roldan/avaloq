package com.exam.avaloq.assignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static Map<String, List<Integer>> fizzBuzz(int num){
        List<Integer> fizzList = new ArrayList<>();
        List<Integer> buzzList = new ArrayList<>();
        List<Integer> fizzBuzzList = new ArrayList<>();

        IntStream.rangeClosed(1, num)
                .forEach(i -> {
                    if (i % 3 == 0) {
                        if (i % 5 == 0) {
                            fizzBuzzList.add(i);
                        } else {
                            fizzList.add(i);
                        }
                    } else if (i % 5 == 0) {
                        buzzList.add(i);
                    }
                });

        Map<String, List<Integer>> map = new HashMap<>();
        map.put("fizz", fizzList);
        map.put("buzz", buzzList);
        map.put("fizzbuzz", fizzBuzzList);

        return map;
    }
}
