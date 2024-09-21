package com.expensetrackingapp.expensetrackingapp.Service.İncomeService;

import com.expensetrackingapp.expensetrackingapp.Dto.İncomeDto;
import com.expensetrackingapp.expensetrackingapp.Repository.İncomeRepository;
import com.expensetrackingapp.expensetrackingapp.entity.İncome;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class İncomeServiceİmpl implements İncomeService{

    @Autowired
    private İncomeRepository i̇ncomeRepository;

    private İncome saveOrUpdateİncome(İncome income, İncomeDto i̇ncomeDto) {
        income.setTitle(i̇ncomeDto.getTitle());
        income.setDate(i̇ncomeDto.getDate());
        income.setAmount(i̇ncomeDto.getAmount());
        income.setCategory(i̇ncomeDto.getCategory());
        income.setDescription(i̇ncomeDto.getDescription());
        return i̇ncomeRepository.save(income);
    }
    public İncome postIncome(İncomeDto i̇ncomeDto){
    return saveOrUpdateİncome(new İncome(),i̇ncomeDto);

    }


    public List<İncome> getAllİncomes(){
        return i̇ncomeRepository.findAll();
    }
    public İncome i̇ncomeUpdate(Long id,İncomeDto i̇ncomeDto){
        Optional<İncome> income = i̇ncomeRepository.findById(id);
        if (income.isPresent()){
            return saveOrUpdateİncome(income.get(),i̇ncomeDto);
        }else {
            throw new EntityNotFoundException("Entity is not found");
        }
    }
    public İncome getİncomeByİd(Long id) {
        Optional<İncome> i̇ncome = i̇ncomeRepository.findById(id);
        if (i̇ncome.isPresent()) {
            return i̇ncome.get();
        } else {
            throw new EntityNotFoundException("İncome is not present");
        }
    }
    public void deleteİncome(Long id){
        Optional<İncome> income= i̇ncomeRepository.findById(id);
        if (income.isPresent()){
            i̇ncomeRepository.delete(income.get());
        }
        else {
            throw new EntityNotFoundException("İncome is not found");
        }


    }


}
