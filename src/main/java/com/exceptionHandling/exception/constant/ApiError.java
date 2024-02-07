package com.exceptionHandling.exception.constant;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data

public class ApiError {
    private Integer errorCode;
    private String  errorDesc;
    private Date data;


}
