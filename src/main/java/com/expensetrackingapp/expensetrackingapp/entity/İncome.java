package com.expensetrackingapp.expensetrackingapp.entity;

import com.expensetrackingapp.expensetrackingapp.Dto.İncomeDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class İncome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Integer amount;
    private LocalDate date;
    private String category;
    private String description;






}
