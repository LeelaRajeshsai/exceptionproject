package com.exceptionHandling.exception.service.impl;

import com.exceptionHandling.exception.GlobalExceptionHandilar.productnotfoundException;
import com.exceptionHandling.exception.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService
{


    @Override
    public Product findbyproductId(String pid) {

        if (pid == "rajesh") {
            return new Product("101", "keyboard", 800.0,"yes");
        }
        else {
            //throw Custom Exception
            throw new productnotfoundException("no product found exception");

        }
    }
}
