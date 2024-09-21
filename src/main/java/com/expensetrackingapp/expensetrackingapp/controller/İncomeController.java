package com.expensetrackingapp.expensetrackingapp.controller;

import com.expensetrackingapp.expensetrackingapp.Dto.İncomeDto;
import com.expensetrackingapp.expensetrackingapp.Service.İncomeService.İncomeService;
import com.expensetrackingapp.expensetrackingapp.entity.İncome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/income")
public class İncomeController {

    @Autowired
    private İncomeService i̇ncomeService;


    @PostMapping("save")
    public ResponseEntity<String> postIncome(@RequestBody İncomeDto i̇ncomeDto){
      İncome createdincome= i̇ncomeService.postIncome(i̇ncomeDto);
        if (createdincome != null) {
            return new ResponseEntity<>("Created", HttpStatus.CREATED);

        } else {
            return new ResponseEntity<>("failed", HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/all")
    public ResponseEntity<List<İncome>>getAll(){
       List<İncome>incomes = i̇ncomeService.getAllİncomes();
       return new ResponseEntity<>(incomes,HttpStatus.OK);
    }
    @PutMapping("update/{id}")
    public ResponseEntity<İncome> updatedİncome(@PathVariable Long id,@RequestBody İncomeDto i̇ncomeDto){
     İncome i̇ncome=   i̇ncomeService.i̇ncomeUpdate(id,i̇ncomeDto);
     return new ResponseEntity<>(i̇ncome,HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<İncome> getbyid(@PathVariable Long id){
        İncome i̇ncome=i̇ncomeService.getİncomeByİd(id);
        return new ResponseEntity<>(i̇ncome,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteİncome(@PathVariable Long id){
        i̇ncomeService.deleteİncome(id);
        return new ResponseEntity<>("deleted",HttpStatus.OK);
    }

    }

