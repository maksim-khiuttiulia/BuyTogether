package com.project.demo.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ErrorResponse {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyy-MM-dd hh:mm:ss")
    private Date date;
    private int status;
    private String messageError;
    private List<String> errors;
}
