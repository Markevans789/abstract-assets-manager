package com.pluralsight;

import java.math.BigDecimal;

public class Cash extends Asset {

    public Cash(BigDecimal originalCost, String description, int dateAcquired) {
        super(originalCost, description, dateAcquired);
    }

    @Override
    public BigDecimal getValue(){
        return getOriginalCost();
    }
    Cash emergencyFund = new Cash(new BigDecimal("9000.02"),"Emergency Cash", 12/26/2026);
}
