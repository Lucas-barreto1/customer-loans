package com.lcs.loans.domain.exceptions;

public class LoanNotAvailableException extends RuntimeException {
    public LoanNotAvailableException(String message) {
        super(message);
    }
}
