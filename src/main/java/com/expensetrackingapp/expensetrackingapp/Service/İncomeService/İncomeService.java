package com.expensetrackingapp.expensetrackingapp.Service.İncomeService;

import com.expensetrackingapp.expensetrackingapp.Dto.İncomeDto;
import com.expensetrackingapp.expensetrackingapp.entity.İncome;

import java.util.List;

public interface İncomeService {
    public İncome postIncome(İncomeDto i̇ncomeDto);
    public List<İncome> getAllİncomes();
    public İncome i̇ncomeUpdate(Long id,İncomeDto i̇ncomeDto);
    public İncome getİncomeByİd(Long id);
    public void deleteİncome(Long id);



    }
