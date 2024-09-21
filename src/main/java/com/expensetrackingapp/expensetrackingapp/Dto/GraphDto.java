package com.expensetrackingapp.expensetrackingapp.Dto;

import com.expensetrackingapp.expensetrackingapp.entity.Expense;
import com.expensetrackingapp.expensetrackingapp.entity.İncome;
import lombok.Data;

import java.util.List;

@Data
public class GraphDto {
    private List<Expense>expenseList;
    private List<İncome>i̇ncomeList;
    private Integer sonuc;
}
