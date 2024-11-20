package com.lcs.loans.domain;

import com.lcs.loans.domain.exceptions.LoanNotAvailableException;

public class Loan {

    private Customer customer;

    public Loan(Customer customer) {
        this.customer = customer;
    }

    public boolean isPersonalLoanAvailable() {
        return basicLoanAvailable();
    }

    public boolean isConsigmentLoanAvailable() {
        return customer.isIncomeEqualOrGreaterThan(5000.0);
    }

    public boolean isGuaranteedLoanAvailable() {
        return basicLoanAvailable();
    }

    public double getPersonalLoanInterestRate() {
        if(this.isPersonalLoanAvailable()){
            return 4.0;
        }
        throw new LoanNotAvailableException("Loan not available");
    }

    public double getConsigmentLoanInterestRate() {
        if(this.isConsigmentLoanAvailable()){
            return 2.0;
        }
        throw new LoanNotAvailableException("Loan not available");
    }

    public double getGuaranteedLoanInterestRate() {
        if(this.isGuaranteedLoanAvailable()){
            return 3.0;
        }
        throw new LoanNotAvailableException("Loan not available");
    }

    private boolean basicLoanAvailable() {
        if(customer.isIncomeEqualOrLowerThan(3000.0)){
            return true;
        }

        return customer.isIncomeBetween(3000.00, 5000.00) &&
                customer.isAgeLowerThan(30) &&
                customer.isFromLocation("SP");
    }
}
