package com.expensetrackingapp.expensetrackingapp.controller;

import com.expensetrackingapp.expensetrackingapp.Dto.ExpenseDto;
import com.expensetrackingapp.expensetrackingapp.Dto.İncomeDto;
import com.expensetrackingapp.expensetrackingapp.Service.ExpenseService.ExpenseService;
import com.expensetrackingapp.expensetrackingapp.Service.İncomeService.İncomeService;
import com.expensetrackingapp.expensetrackingapp.entity.Expense;
import com.expensetrackingapp.expensetrackingapp.entity.İncome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;


    @PostMapping("post")
    public ResponseEntity<String> postIncome(@RequestBody ExpenseDto expenseDto){
        Expense createdincome= expenseService.postExpense(expenseDto);
        if (createdincome != null) {
            return new ResponseEntity<>("Created", HttpStatus.CREATED);

        } else {
            return new ResponseEntity<>("failed", HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/all")
    public ResponseEntity<List<Expense>>getAll(){
        List<Expense>expenses = expenseService.getAllExpense();
        return new ResponseEntity<>(expenses,HttpStatus.OK);
    }
    @PutMapping("update/{id}")
    public ResponseEntity<Expense> updatedİncome(@PathVariable Long id, @RequestBody ExpenseDto expenseDto){
        Expense expense=   expenseService.expenseUpdate(id,expenseDto);
        return new ResponseEntity<>(expense,HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Expense> getbyid(@PathVariable Long id){
        Expense expense=expenseService.getExpenseByİd(id);
        return new ResponseEntity<>(expense,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteİncome(@PathVariable Long id){
        expenseService.deleteExpense(id);
        return new ResponseEntity<>("deleted",HttpStatus.OK);
    }

}


