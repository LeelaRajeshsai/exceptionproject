package com.exceptionHandling.exception.service.impl;

import com.exceptionHandling.exception.GlobalExceptionHandilar.productnotfoundException;
import com.exceptionHandling.exception.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService
{


    @Override
    public Product findbyproductId(Integer pid) {

        if (pid == 101) {
            return new Product("101", "keyboard", 800.0);
        }
        else {
            //throw Custom Exception
            throw new productnotfoundException("no product found exception");

        }
    }
}
