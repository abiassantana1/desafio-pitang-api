package com.desafio.pitang.desafio_pitang.exception;

import lombok.Getter;

import java.util.List;

@Getter
public class MultipleBusinessException extends RuntimeException {

    private final List<BusinessException> exceptions;

    public MultipleBusinessException(List<BusinessException> exceptions) {
        super("");
        this.exceptions = exceptions;
    }

}
