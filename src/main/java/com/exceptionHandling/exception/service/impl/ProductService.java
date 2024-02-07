package com.exceptionHandling.exception.service.impl;

import com.exceptionHandling.exception.GlobalExceptionHandilar.productnotfoundException;
import com.exceptionHandling.exception.model.Product;

public interface ProductService {

    public Product findbyproductId(Integer pid);
}
