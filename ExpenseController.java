package com.harshil.expensetracker.controller;

import com.harshil.expensetracker.entity.Expense;
import com.harshil.expensetracker.exception.NoResourceFoundException;
import com.harshil.expensetracker.service.ExpenseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Pageable;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ExpenseController {

    @Autowired
    private ExpenseServiceImpl expenseService;

    @GetMapping("/expenses")
    public List<Expense> getAllExpenses(Pageable pageable) {
        return expenseService.getAllExpenses(pageable);
    }

    @GetMapping("/expenses/{id}")
    public Expense getExpenseById(@PathVariable long id) throws NoResourceFoundException {
        return expenseService.getExpenseById(id);
    }

    @PostMapping("/expenses")
    public Expense saveExpense(@Valid @RequestBody Expense expense) {
        return expenseService.saveExpense(expense);
    }

    @PutMapping("/expenses/{id}")
    public Expense updateExpense(@PathVariable Long id,@Valid @RequestBody Expense expense) {
        return expenseService.updateExpense(id, expense);
    }

    @DeleteMapping("/expenses")
    public String deleteExpense(@RequestParam Long id) {
        expenseService.deleteExpense(id);
        return "Delete Successfully";
    }
}
