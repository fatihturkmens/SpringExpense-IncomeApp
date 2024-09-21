package com.expensetrackingapp.expensetrackingapp.Dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ExpenseDto {
    private Long id;

    private String title;
    private Integer amount;
    private LocalDate date;
    private String category;
    private String description;
}
