package com.expensetrackingapp.expensetrackingapp.Service.ExpenseService;

import com.expensetrackingapp.expensetrackingapp.Dto.ExpenseDto;
import com.expensetrackingapp.expensetrackingapp.Dto.İncomeDto;
import com.expensetrackingapp.expensetrackingapp.entity.Expense;
import com.expensetrackingapp.expensetrackingapp.entity.İncome;

import java.util.List;

public interface ExpenseService {
    public Expense postExpense(ExpenseDto expenseDto);
    public List<Expense> getAllExpense();
    public Expense expenseUpdate(Long id,ExpenseDto expenseDto);
    public Expense getExpenseByİd(Long id);
    public void deleteExpense(Long id);


}



