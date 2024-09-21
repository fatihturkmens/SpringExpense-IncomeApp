package com.expensetrackingapp.expensetrackingapp.Repository;

import com.expensetrackingapp.expensetrackingapp.entity.İncome;
import org.springframework.cglib.core.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface İncomeRepository extends JpaRepository<İncome,Long> {
    List<İncome>findByDateBetween(LocalDate startDate, LocalDate endDate);




}
