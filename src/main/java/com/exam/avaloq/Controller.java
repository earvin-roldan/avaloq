package com.exam.avaloq;

import com.exam.avaloq.assignment2.FizzBuzz;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/avaloq")
public class Controller {

    @GetMapping(path = "/fizzbuzz",produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, List<Integer>> fizzBuzz(@RequestParam int num) {
        return FizzBuzz.fizzBuzz(num);
    }
}
