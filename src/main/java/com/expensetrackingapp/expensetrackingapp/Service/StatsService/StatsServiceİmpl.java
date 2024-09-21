package com.expensetrackingapp.expensetrackingapp.Service.StatsService;

import com.expensetrackingapp.expensetrackingapp.Dto.GraphDto;
import com.expensetrackingapp.expensetrackingapp.Repository.ExpenseRepository;
import com.expensetrackingapp.expensetrackingapp.Repository.İncomeRepository;
import com.expensetrackingapp.expensetrackingapp.entity.Expense;
import com.expensetrackingapp.expensetrackingapp.entity.İncome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class StatsServiceİmpl implements StatsService{
    @Autowired
    private İncomeRepository i̇ncomeRepository;

    @Autowired
    private ExpenseRepository expenseRepository;







    public GraphDto getChartData(){
        LocalDate endDate = LocalDate.now();
        LocalDate startDate = endDate.minusDays(27);
        GraphDto graphDto = new GraphDto();
        graphDto.setExpenseList(expenseRepository.findByDateBetween(startDate,endDate));
        graphDto.setİncomeList(i̇ncomeRepository.findByDateBetween(startDate,endDate));


        return graphDto;
    }




    }



