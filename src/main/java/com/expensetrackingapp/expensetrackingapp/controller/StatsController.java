package com.expensetrackingapp.expensetrackingapp.controller;

import com.expensetrackingapp.expensetrackingapp.Dto.GraphDto;
import com.expensetrackingapp.expensetrackingapp.Service.ExpenseService.ExpenseService;
import com.expensetrackingapp.expensetrackingapp.Service.StatsService.StatsService;
import com.expensetrackingapp.expensetrackingapp.Service.İncomeService.İncomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stats")
@RequiredArgsConstructor
public class StatsController {

    private final StatsService statsService;

    private final İncomeService i̇ncomeService;

    private final ExpenseService expenseService;

    @GetMapping("/chart")
    public ResponseEntity<GraphDto> getChartDetails(){
        return ResponseEntity.ok(statsService.getChartData());
    }


   }







