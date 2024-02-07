package com.exceptionHandling.exception.controller;

import com.exceptionHandling.exception.model.Product;
import com.exceptionHandling.exception.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {
@Autowired
    private ProductService productService;
    @GetMapping(value ="/getProduct",produces = {"application/json"})
    public Product getproductbyId(@RequestParam("pid") String pid)
    {
        return productService.findbyproductId(Integer.parseInt(pid));

    }
}
