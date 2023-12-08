package com.niewski.aoc23.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niewski.aoc23.responses.TwoIntResponse;
import com.niewski.aoc23.solutions.DayOne;
import com.niewski.aoc23.solutions.DayThree;
import com.niewski.aoc23.solutions.DayTwo;

@RestController
@RequestMapping("/api")
public class ProblemController {
    @GetMapping("/test")
    public ResponseEntity<String> testEndpoint() {
        return ResponseEntity.ok("API is working!");
    }

    @PostMapping("/day1")
    public ResponseEntity<TwoIntResponse> solveDayOne(@RequestBody String[] inputs) {
        return ResponseEntity.ok(DayOne.solve(inputs));
    }

    @PostMapping("/day2")
    public ResponseEntity<TwoIntResponse> solveDayTwo(@RequestBody String input) {
        return ResponseEntity.ok(DayTwo.solve(input));
    }

    @PostMapping("/day3")
    public ResponseEntity<TwoIntResponse> solveDayThree(@RequestBody char[][] input) {
        return ResponseEntity.ok(DayThree.solve(input));
    }
}

