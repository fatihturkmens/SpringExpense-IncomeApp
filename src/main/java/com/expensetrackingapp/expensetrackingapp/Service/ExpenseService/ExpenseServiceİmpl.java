package com.expensetrackingapp.expensetrackingapp.Service.ExpenseService;

import com.expensetrackingapp.expensetrackingapp.Dto.ExpenseDto;
import com.expensetrackingapp.expensetrackingapp.Dto.İncomeDto;
import com.expensetrackingapp.expensetrackingapp.Repository.ExpenseRepository;
import com.expensetrackingapp.expensetrackingapp.entity.Expense;
import com.expensetrackingapp.expensetrackingapp.entity.İncome;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseServiceİmpl implements ExpenseService{
    @Autowired
    private ExpenseRepository expenseRepository;

    private Expense saveOrUpdateExpense(Expense expense, ExpenseDto expenseDto) {
        expense.setTitle(expenseDto.getTitle());
        expense.setDate(expenseDto.getDate());
        expense.setAmount(expenseDto.getAmount());
        expense.setCategory(expenseDto.getCategory());
        expense.setDescription(expenseDto.getDescription());
        return expenseRepository.save(expense);
    }
    public Expense postExpense(ExpenseDto expenseDto){
        return saveOrUpdateExpense(new Expense(),expenseDto);

    }


    public List<Expense> getAllExpense(){
        return expenseRepository.findAll();
    }
    public Expense expenseUpdate(Long id, ExpenseDto expenseDto){
        Optional<Expense> expense = expenseRepository.findById(id);
        if (expense.isPresent()){
            return saveOrUpdateExpense(expense.get(),expenseDto);
        }else {
            throw new EntityNotFoundException("Entity is not found");
        }
    }
    public Expense getExpenseByİd(Long id) {
        Optional<Expense> expense = expenseRepository.findById(id);
        if (expense.isPresent()) {
            return expense.get();
        } else {
            throw new EntityNotFoundException("İncome is not present");
        }
    }
    public void deleteExpense(Long id){
        Optional<Expense> expense= expenseRepository.findById(id);
        if (expense.isPresent()){
            expenseRepository.delete(expense.get());
        }
        else {
            throw new EntityNotFoundException("İncome is not found");
        }
    }

}


