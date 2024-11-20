package com.lcs.loans.controllers.dto;

import com.lcs.loans.domain.enums.LoanType;

public record LoanResponse(LoanType type, Double interestRate) {
}
