package com.exceptionHandling.exception.controller;

import com.exception2.service.EmployeeService;
import com.exceptionHandling.exception.model.Product;
import com.exceptionHandling.exception.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {
@Autowired
    private EmployeeService productService;
    @GetMapping(value ="/getProduct",produces = {"application/json"})
    public Product getproductbyId(@RequestParam("pid") String pid)
    {
        return productService.findbypro(pid);

    }
}
