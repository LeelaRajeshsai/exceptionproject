package com.exceptionHandling.exception.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Product {

    private String pid;
    private String bookName;
    private  double price;
}
