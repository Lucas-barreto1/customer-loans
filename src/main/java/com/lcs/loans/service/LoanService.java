package com.lcs.loans.service;

import com.lcs.loans.controllers.dto.CustomerLoanRequest;
import com.lcs.loans.controllers.dto.CustomerLoanResponse;
import com.lcs.loans.controllers.dto.LoanResponse;
import com.lcs.loans.domain.Loan;
import com.lcs.loans.domain.enums.LoanType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

    public CustomerLoanResponse checkLoanAvailability(CustomerLoanRequest request) {
        var customer = request.toCustomer();
        var loan = new Loan(customer);

        List<LoanResponse> loans = new ArrayList<>();

        if(loan.isPersonalLoanAvailable()) {
            loans.add(new LoanResponse(LoanType.PERSONAL, loan.getPersonalLoanInterestRate()));
        }

        if(loan.isConsigmentLoanAvailable()) {
            loans.add(new LoanResponse(LoanType.CONSIGNMENT, loan.getConsigmentLoanInterestRate()));
        }

        if(loan.isGuaranteedLoanAvailable()) {
            loans.add(new LoanResponse(LoanType.GUARANTEED, loan.getGuaranteedLoanInterestRate()));
        }

        return new CustomerLoanResponse(request.name(), loans);
    }
}
